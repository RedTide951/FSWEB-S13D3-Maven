package org.example;

public class Main {

    class Person {
        String firstName;
        String lastName;
        int age;
        String job;
        boolean isEmployed;
        boolean isDeveloper;


        public Person(String firstName,String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Person(String firstName,String lastName, int age, String job, boolean isEmployed, boolean isDeveloper) {
            this(firstName, lastName, age);
            this.job = job;
            this.isEmployed = isEmployed;
            this.isDeveloper = isDeveloper;
        }

    }



    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}
