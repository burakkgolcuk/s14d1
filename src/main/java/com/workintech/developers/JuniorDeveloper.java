package com.workintech.developers;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        // örnek zam: +10%
        setSalary(getSalary() * 1.10);
        System.out.println("JuniorDeveloper starts to working. New salary: " + getSalary());
    }
}
