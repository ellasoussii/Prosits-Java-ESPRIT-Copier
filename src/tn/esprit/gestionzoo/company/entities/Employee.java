
package tn.esprit.gestionzoo.company.entities;

import java.util.Objects;


public class Employee implements Comparable<Employee> {

    private int id;
    private String lastName;
    private String firstName;
    private String departmentName;
    private int grade;


    public Employee() {
    }

    public Employee(int id, String lastName, String firstName,
                    String departmentName, int grade) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.departmentName = departmentName;
        this.grade = grade;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Equality based on id and name
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Employee employee = (Employee) obj;

        return id == employee.id
                && Objects.equals(lastName, employee.lastName)
                && Objects.equals(firstName, employee.firstName);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        return Integer.compare(this.id, employee.id);
    }
}
