# question1
an application which provides a REST API for “task” objects
this is a SpringBoot application which provides a REST API with endpoints for searching, creating, deleting and running “task” objects. spring initializr is used to generate a basic Spring Boot project with configurations. this project was executed in vscode. To start this project run the TaskapiApplication.java file. Postman is used to test the APIs.

1.Method: GET (To get all tasks) URL: http://localhost:8080/tasks

<img width="1277" alt="get all tasks" src="https://github.com/user-attachments/assets/4efe9ca0-1db4-4c72-ad37-38f812c439eb" />


2.Method: GET (To Get a task by ID) URL: http://localhost:8080/tasks?id=TASK_ID

<img width="1277" alt="search task by id" src="https://github.com/user-attachments/assets/4839c0dd-0ee3-4fad-950e-b12d34c9eea6" />


3.Method: PUT (To Create a new task)
for body: select raw->json and type the content of task object. URL: http://localhost:8080/tasks

<img width="1277" alt="create task" src="https://github.com/user-attachments/assets/abd45214-3364-42bd-b73c-0d9597822063" />


4.Method: DELETE (Delete a task) URL: http://localhost:8080/tasks/TASK_ID

<img width="1277" alt="delete task" src="https://github.com/user-attachments/assets/00904b63-0077-4f88-b1f0-43f3f3d0b834" />


5.Method: GET (Search tasks by name) URL: http://localhost:8080/tasks/search?name=task_name

<img width="1277" alt="search task by name" src="https://github.com/user-attachments/assets/a9013741-18de-4339-b977-c8514346a0b1" />


6.Method: PUT (Execute a task by ID) URL: http://localhost:8080/tasks/TASK_ID/execute

<img width="1277" alt="execute a task by id" src="https://github.com/user-attachments/assets/f9581e02-27e1-44a3-b47c-0eabd208ead0" />
