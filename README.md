# Java Practical Work – ESPRIT

## 📌 Project Overview

This repository contains a collection of Java practical assignments (Prosits) completed as part of the Java programming course at **ESPRIT**.

The project focuses on learning and applying Object-Oriented Programming (OOP) concepts through practical exercises, progressively developing Java applications and improving programming skills.

The practical work includes entity management, inheritance, abstraction, interfaces, exception handling, collections, and object sorting.

## 🛠️ Technologies & Tools

- **Programming Language:** Java
- **JDK:** Java 21
- **IDE:** IntelliJ IDEA
- **Version Control:** Git & GitHub
- **Application Server:** Apache Tomcat (for relevant exercises)

## 📚 Topics Covered

Throughout the practical assignments, the following Java concepts are explored:

- Classes and Objects
- Constructors
- Encapsulation
- Getters and Setters
- Inheritance
- Polymorphism
- Method Overloading and Overriding
- Abstract Classes and Methods
- Interfaces
- Generic Programming
- Enumerations (Enums)
- Exception Handling
- Custom Exceptions
- Collections Framework
- ArrayList
- Comparable and Comparator
- Object Equality (`equals()`)
- Object Representation (`toString()`)

## 📂 Project Modules

### 1. Zoo Management System

A Java application designed to manage a zoo and its animals.

**Main functionalities and concepts:**
- Creating and managing animals and zoos.
- Adding animals to a zoo.
- Managing zoo capacity.
- Implementing inheritance between animal types.
- Using abstract classes and methods.
- Managing aquatic and terrestrial animals.
- Implementing custom exceptions for invalid ages and full zoos.
- Defining animal feeding behaviors through generic interfaces.

**Main classes include:**
- `Animal`
- `Zoo`
- `Aquatic`
- `Terrestrial`
- `Dolphin`
- `Penguin`
- `ZooManagement`

### 2. Employee Management System

A Java application designed to manage employees within a company using the `ArrayList` collection.

**Main functionalities:**
- Adding employees.
- Searching employees by name or object.
- Deleting employees.
- Displaying the employee list.
- Sorting employees by ID using `Comparable`.
- Sorting employees by department name and grade using `Comparator`.

**Main classes include:**
- `Employee`
- `IGestion`
- `CompanyArrayList`
- `CompanyManagement`

## 📁 Project Structure

```text
src/
└── tn/esprit/gestionzoo/
    ├── entities/
    │   ├── Animal.java
    │   ├── Zoo.java
    │   ├── Aquatic.java
    │   ├── Terrestrial.java
    │   ├── Dolphin.java
    │   └── Penguin.java
    │
    ├── company/
    │   ├── entities/
    │   │   └── Employee.java
    │   ├── interfaces/
    │   │   └── IGestion.java
    │   └── services/
    │       └── CompanyArrayList.java
    │
    └── main/
        ├── ZooManagement.java
        └── CompanyManagement.java
```

*Note: The structure above highlights the main packages and classes. Additional classes, interfaces, and exceptions are included in the project.*

## ▶️ How to Run the Project

1. Clone the repository:

   ```bash
   git clone YOUR_REPOSITORY_URL
   ```

2. Open the project in IntelliJ IDEA.
3. Configure JDK 21.
4. Navigate to the desired main class.
5. Run its `main()` method.

For example:

- `ZooManagement.java` to run the Zoo Management System.
- `CompanyManagement.java` to run the Employee Management System.

## 🎯 Learning Objectives

The main objective of this project is to strengthen Java programming skills through hands-on exercises and understand how Object-Oriented Programming principles are applied when developing real applications.

## 👩‍💻 Author

**Java Coursework – ESPRIT**

---

*Learning Java through practice, one Prosit at a time.*
