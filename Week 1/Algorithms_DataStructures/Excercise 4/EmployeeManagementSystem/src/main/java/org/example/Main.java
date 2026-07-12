package org.example;

public class Main {

    public static void main(String[] args) {

        EmployeeManagement management = new EmployeeManagement();

        Employee employee1 = new Employee();
        employee1.employeeId = 101;
        employee1.name = "Arshia";
        employee1.position = "Manager";
        employee1.salary = 50000;

        Employee employee2 = new Employee();
        employee2.employeeId = 102;
        employee2.name = "Radha";
        employee2.position = "Developer";
        employee2.salary = 40000;

        management.addEmployee(employee1);
        management.addEmployee(employee2);

        System.out.println("Employee List:");
        management.traverseEmployees();

        Employee found = management.searchEmployee(102);

        if (found != null) {
            System.out.println("\nEmployee Found: " + found.name);
        }

        management.deleteEmployee(101);

        System.out.println("\nAfter Deletion:");
        management.traverseEmployees();
    }
}