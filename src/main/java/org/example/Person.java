package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String job;
    boolean isEmployed;
    boolean isDeveloper;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age < 19;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String job, boolean isEmployed, boolean isDeveloper) {
        this(firstName, lastName, age);
        this.job = job;
        this.isEmployed = isEmployed;
        this.isDeveloper = isDeveloper;
    }
}
