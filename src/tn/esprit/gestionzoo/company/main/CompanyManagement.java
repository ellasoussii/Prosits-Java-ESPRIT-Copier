
package tn.esprit.gestionzoo.company.main;

import tn.esprit.gestionzoo.company.services.CompanyArrayList;
import tn.esprit.gestionzoo.company.entities.Employee;

public class CompanyManagement {

    public static void main(String[] args) {

        CompanyArrayList company = new CompanyArrayList();


        Employee e1 = new Employee(3, "Smith", "John", "IT", 2);
        Employee e2 = new Employee(1, "Brown", "Sarah", "HR", 3);
        Employee e3 = new Employee(2, "White", "David", "IT", 1);
        Employee e4 = new Employee(4, "Taylor", "Emma", "Finance", 2);


        System.out.println("===== ADD EMPLOYEES =====");

        company.addEmployee(e1);
        company.addEmployee(e2);
        company.addEmployee(e3);
        company.addEmployee(e4);

        company.displayEmployee();

        // Search by name
        System.out.println("\n===== SEARCH BY NAME =====");

        System.out.println("Search John: " +
                company.searchEmployee("John"));

        System.out.println("Search Alice: " +
                company.searchEmployee("Alice"));



        System.out.println("\n===== SEARCH BY OBJECT =====");

        Employee search = new Employee(
                3, "Smith", "John", "Marketing", 5
        );

        System.out.println("Employee exists: " +
                company.searchEmployee(search));


        System.out.println("\n===== SORT BY ID =====");

        company.sortEmployeeById();
        company.displayEmployee();

        System.out.println("\n===== SORT BY DEPARTMENT AND GRADE =====");

        company.sortEmployeeByDepartementNameAndGrade();
        company.displayEmployee();


        System.out.println("\n===== DELETE EMPLOYEE =====");

        company.deleteEmployee(e1);
        company.displayEmployee();
    }
}
