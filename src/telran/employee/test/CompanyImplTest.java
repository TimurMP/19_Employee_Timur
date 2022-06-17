package telran.employee.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import telran.employee.dao.Company;
import telran.employee.dao.CompanyImpl;
import telran.employee.model.Employee;
import telran.employee.model.Manager;
import telran.employee.model.SalesManager;
import telran.employee.model.WageEmployee;

import static org.junit.jupiter.api.Assertions.*;


class CompanyImplTest {
    Company company;
    Employee[] firm;


    @BeforeEach
    void setUp() {
        company = new CompanyImpl(5);
        firm = new Employee[4];
        firm[0] = new Manager(1000, "John", "Smith", 182, 20000, 20);
        firm[1] = new WageEmployee(2000, "Mary", "Smith", 182, 40);
        firm[2] = new SalesManager(3000, "Peter", "Jackson", 182, 40000, 0.1);
        firm[3] = new SalesManager(4000, "Tigran", "Petrosyan", 91, 80000, 0.1);
        for (int i = 0; i < firm.length; i++) {
            company.addEmployee(firm[i]);

        }}


    @Test
    void testAddEmployee() {
        assertFalse(company.addEmployee(firm[3]));
        Employee employee = new SalesManager(5000, "Peter", "Jackson", 182, 40000, 0.1);
        assertTrue(company.addEmployee(employee));
        assertEquals(5, company.size());
        employee = new SalesManager(6000, "Peter", "Jackson", 182, 40000, 0.1);
        assertFalse(company.addEmployee(employee));

    }

    @Test
    void removeEmployee() {
    }

    @Test
    void findEmployee() {
        Employee employee = company.findEmployee(1000);
        System.out.println(employee);
        assertEquals(firm[0], employee);
        assertNull(company.findEmployee(0));
    }

    @Test
    void totalSalary() {
    }

    @Test
    void averageSalary() {
    }

    @Test
    void totalSales() {
    }

    @Test
    void size() {
        assertEquals(4,company.size());
    }

    @Test
    void printEmployees() {
    }
}