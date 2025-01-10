package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Person person1 = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Is Teen?: " + person1.isTeen());
    }
}
