import Basics.Singleton;

import java.util.*;

// Abstraction: Abstract class Person
abstract class Person {
    private String name; // Encapsulation: private fields
    private int age;

    public Person(String name, int age) { // name and age in constructor
        this.name = name;
        this.age = age;
    };

    public abstract void eat();
    // Encapsulation: getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

// Inheritance: Employee extends Person
class Employee extends Person {
    private int empId;
    private String empRole;
    private int salary;

    public Employee(String name, int age, int empId, String empRole, int salary) {
        super(name, age);
        this.empId = empId;
        this.empRole = empRole;
        this.salary = salary;
    }
    public void eat(){
        System.out.println("Emp eating");
    }
    // Encapsulation: getters and setters
    public int getEmpId() { return empId; }
    public void setEmpId(int empId) { this.empId = empId; }

    public String getEmpRole() { return empRole; }
    public void setEmpRole(String empRole) { this.empRole = empRole; }

    public int getSalary() { return salary; }
    public void setSalary(int salary) { this.salary = salary; }

    public String getRole() {
        return empRole;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + "', age=" + getAge() +
                ", empId=" + empId +
                ", empRole='" + empRole + '\'' +
                ", salary=" + salary +
                '}';
    }
}

// Inheritance: Manager extends Employee
class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int age, int empId, String empRole, int salary, int teamSize) {
        super(name, age, empId, empRole, salary);
        this.teamSize = teamSize;
    }

    // Encapsulation: getter and setter
    public int getTeamSize() { return teamSize; }
    public void setTeamSize(int teamSize) { this.teamSize = teamSize; }

    // Polymorphism: override getRole
    @Override
    public String getRole() {
        return "Manager";
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + getName() + "', age=" + getAge() +
                ", empId=" + getEmpId() +
                ", empRole='" + getEmpRole() + '\'' +
                ", salary=" + getSalary() +
                ", teamSize=" + teamSize +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Polymorphism: reference of Person, object of Employee
        Employee emp = new Employee("Ruth", 20, 101, "Developer", 50000);
        Manager mgr = new Manager("Fury", 30, 201, "Lead", 80000, 5);

        Person p1 = new Person("Ruth", 23){
            @Override
            public void eat() {
            }
        };

        System.out.println(emp.toString());
        System.out.println("Role: " + emp.getRole());

        System.out.println(mgr.toString());
        System.out.println("Role: " + mgr.getRole());

        Singleton s1 =  Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        System.out.println(Singleton.getObjectsCreated());

    }
}
