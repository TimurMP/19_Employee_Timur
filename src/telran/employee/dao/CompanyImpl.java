package telran.employee.dao;

import telran.employee.model.Employee;

public class CompanyImpl implements Company {

    Employee[] employees;
    int size;

    public CompanyImpl(int capacity) {
        employees = new Employee[capacity];
    }

    @Override
    public boolean addEmployee(Employee employee) {
        if (employees.length == size) {
            return false;
        }
        if (employee.equals(findEmployee(employee.getId()))) {
            return false;
        }

        employees[size] = employee;
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (id == employees[i].getId()) {
                Employee employee = employees[i];
                employees[i] = employees[size - 1];
                employees[size - 1] = null;
                size--;
                return employee;
            }

        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        if (id <= 0) {
            return null;
        }
        for (int i = 0; i < size; i++) {
            if (id == employees[i].getId()) {
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public double totalSalary() {
        double salary = 0;
        for (int i = 0; i < size; i++) {
            salary += employees[i].calcSalary();

        }
        return salary;
    }

    @Override
    public double averageSalary() {
        return 0;
    }

    @Override
    public double totalSales() {
        return 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printEmployees() {

    }
}
