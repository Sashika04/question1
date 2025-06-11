package com.sashika.taskapi.service;

import com.sashika.taskapi.model.Task;
import com.sashika.taskapi.model.TaskExecution;
import com.sashika.taskapi.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Optional<Task> getTaskById(String id) {
        return repository.findById(id);
    }

    public Task createTask(Task task) {
        if (!isValidCommand(task.getCommand())) {
            throw new RuntimeException("Unsafe command detected!");
        }
        return repository.save(task);
    }

    public void deleteTask(String id) {
        repository.deleteById(id);
    }

    public List<Task> findByName(String name) {
        return repository.findByNameContaining(name);
    }

    public TaskExecution executeTask(String id) throws Exception {
        Task task = repository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        TaskExecution execution = new TaskExecution();
        execution.setStartTime(new Date());

        String output = runCommand(task.getCommand());

        execution.setEndTime(new Date());
        execution.setOutput(output);

        task.getTaskExecutions().add(execution);
        repository.save(task);

        return execution;
    }

    private String runCommand(String command) throws Exception {
        Process process = Runtime.getRuntime().exec(command);
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        StringBuilder output = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            output.append(line).append("\n");
        }
        process.waitFor();
        return output.toString().trim();
    }

    private boolean isValidCommand(String command) {
        String[] blacklist = {"rm", "sudo", "curl", "wget", "shutdown"};
        return Arrays.stream(blacklist).noneMatch(command::contains);
    }
}
