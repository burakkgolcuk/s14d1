package com.workintech.developers;

public class MidDeveloper extends Employee {
    public MidDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        // örnek zam: +15%
        setSalary(getSalary() * 1.15);
        System.out.println("MidDeveloper starts to working. New salary: " + getSalary());
    }
}
