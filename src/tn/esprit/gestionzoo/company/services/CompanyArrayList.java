
package tn.esprit.gestionzoo.company.services;

import tn.esprit.gestionzoo.company.entities.Employee;
import tn.esprit.gestionzoo.company.interfaces.IGestion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class CompanyArrayList implements IGestion<Employee> {

    private ArrayList<Employee> employees;


    public CompanyArrayList() {
        employees = new ArrayList<>();
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }


    @Override
    public boolean searchEmployee(String name) {
        for (Employee employee : employees) {
            if (employee.getFirstName().equalsIgnoreCase(name)
                    || employee.getLastName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean searchEmployee(Employee employee) {
        return employees.contains(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employees.remove(employee);
    }

    // 5. Display all employees
    @Override
    public void displayEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }


    @Override
    public void sortEmployeeById() {
        Collections.sort(employees);
    }


    @Override
    public void sortEmployeeByDepartementNameAndGrade() {
        employees.sort(
                Comparator.comparing(Employee::getDepartmentName)
                        .thenComparingInt(Employee::getGrade)
        );
    }
}
