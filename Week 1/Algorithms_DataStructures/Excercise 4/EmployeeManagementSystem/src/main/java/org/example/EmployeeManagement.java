package org.example;

public class EmployeeManagement {

    Employee[] employees = new Employee[100];
    int count = 0;

    public void addEmployee(Employee employee) {
        employees[count++] = employee;
    }

    public Employee searchEmployee(int employeeId) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == employeeId) {
                return employees[i];
            }
        }

        return null;
    }

    public void traverseEmployees() {

        for (int i = 0; i < count; i++) {

            System.out.println(
                    employees[i].employeeId + " "
                            + employees[i].name + " "
                            + employees[i].position + " "
                            + employees[i].salary
            );
        }
    }

    public void deleteEmployee(int employeeId) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == employeeId) {

                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[count - 1] = null;
                count--;
                break;
            }
        }
    }
}