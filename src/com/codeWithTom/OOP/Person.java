package com.codeWithTom.OOP;

public class Person extends PersonAb implements IPerson{
    String name;
    boolean sex;

    public Person(String name, boolean sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello World");
    }

    public void choseJob(String job) {
        System.out.println("I choose this job: " + job);
    }

}
