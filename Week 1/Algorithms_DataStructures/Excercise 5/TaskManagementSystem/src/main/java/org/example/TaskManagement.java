package org.example;

public class TaskManagement {

    class Node {

        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    public void addTask(Task task) {

        Node newNode = new Node(task);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public Task searchTask(int taskId) {

        Node current = head;

        while (current != null) {

            if (current.task.taskId == taskId) {
                return current.task;
            }

            current = current.next;
        }

        return null;
    }

    public void traverseTasks() {

        Node current = head;

        while (current != null) {

            System.out.println(
                    current.task.taskId + " "
                            + current.task.taskName + " "
                            + current.task.status
            );

            current = current.next;
        }
    }

    public void deleteTask(int taskId) {

        if (head == null) {
            return;
        }

        if (head.task.taskId == taskId) {
            head = head.next;
            return;
        }

        Node current = head;

        while (current.next != null) {

            if (current.next.task.taskId == taskId) {
                current.next = current.next.next;
                return;
            }

            current = current.next;
        }
    }
}