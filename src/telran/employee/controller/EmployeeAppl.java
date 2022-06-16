package telran.employee.controller;

import telran.employee.model.Employee;
import telran.employee.model.Manager;
import telran.employee.model.SalesManager;
import telran.employee.model.WageEmployee;

public class EmployeeAppl {

    public static void main(String[] args) {
        Employee[] firm = new Employee[5];
        firm[0] = new Manager(1000, "John", "Smith", 182, 20000, 20);
        firm[1] = new WageEmployee(2000, "Mary", "Smith", 182, 40);
        firm[2] = new SalesManager(3000, "Peter", "Jackson", 182, 40000, 0.1);
        firm[3] = new SalesManager(4000, "Tigran", "Petrosyan", 91, 80000, 0.1);

        printArry(firm);
        double total = totalSalary(firm);
        System.out.println("Total Salary: " + total);
    }

    private static double totalSalary(Employee[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                sum += arr[i].calcSalary();

            }

        }

        return sum;
    }

    private static void printArry(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
            }
        }
    }

}
