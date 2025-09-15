package com.workintech.developers;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        // örnek zam: +20%
        setSalary(getSalary() * 1.20);
        System.out.println("SeniorDeveloper starts to working. New salary: " + getSalary());
    }
}
