# question1
an application which provides a REST API for “task” objects.

this is a SpringBoot application which provides a REST API with endpoints for searching, creating, deleting and running “task” objects. spring initializr is used to generate a basic Spring Boot project with configurations. this project was executed in vscode. To start this project run the TaskapiApplication.java file. Postman is used to test the APIs.


1.Method: GET (To get all tasks) URL: http://localhost:8080/tasks
<img width="1277" alt="get all tasks" src="https://github.com/user-attachments/assets/a812461d-6338-4663-bb97-8aa9eb6de051" />
￼
2.Method: GET (To Get a task by ID) URL: http://localhost:8080/tasks?id=TASK_ID
<img width="1277" alt="search task by id" src="https://github.com/user-attachments/assets/73312957-f819-4834-ba3f-16edaf0f7dd1" />
￼
3.Method: PUT (To Create a new task) for body: select raw->json and type the content of task object. URL: http://localhost:8080/tasks
<img width="1277" alt="create task" src="https://github.com/user-attachments/assets/89b338f9-5844-45bf-bfdb-02c4ff1a842a" />
￼
4.Method: DELETE (Delete a task) URL: http://localhost:8080/tasks/TASK_ID
<img width="1277" alt="delete task" src="https://github.com/user-attachments/assets/2ddce6bd-473f-406d-9371-3eba913a8c64" />
￼
5.Method: GET (Search tasks by name) URL: http://localhost:8080/tasks/search?name=task_name
￼<img width="1277" alt="search task by name" src="https://github.com/user-attachments/assets/88445af7-72e1-4d59-bd14-33aae64df773" />

6.Method: PUT (Execute a task by ID) URL: http://localhost:8080/tasks/TASK_ID/execute
￼<img width="1277" alt="execute a task by id" src="https://github.com/user-attachments/assets/26c55e5b-b4b2-4565-b779-d3b74a6612c7" />
