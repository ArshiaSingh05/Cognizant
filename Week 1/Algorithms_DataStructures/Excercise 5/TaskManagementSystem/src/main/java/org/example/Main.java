package org.example;

public class Main {

    public static void main(String[] args) {

        TaskManagement taskManagement = new TaskManagement();

        Task task1 = new Task();
        task1.taskId = 1;
        task1.taskName = "Design UI";
        task1.status = "Pending";

        Task task2 = new Task();
        task2.taskId = 2;
        task2.taskName = "Develop Backend";
        task2.status = "Completed";

        taskManagement.addTask(task1);
        taskManagement.addTask(task2);

        System.out.println("Task List:");
        taskManagement.traverseTasks();

        Task found = taskManagement.searchTask(2);

        if (found != null) {
            System.out.println("\nTask Found: " + found.taskName);
        }

        taskManagement.deleteTask(1);

        System.out.println("\nAfter Deletion:");
        taskManagement.traverseTasks();
    }
}