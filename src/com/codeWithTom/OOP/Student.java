package com.codeWithTom.OOP;

public class Student extends Person implements IPerson2{
    String studentCode;
    String className;

    public Student(String name, boolean sex, String studentCode, String className) {
        super(name, sex);
        this.studentCode = studentCode;
        this.className = className;
    }

    @Override
    public void choseJob(String job) {
        super.choseJob(job);
    }

    @Override
    public void doFreeTime() {
        System.out.println("Go fishing");
    }
}
