package com.workintech.developers;

import java.util.Arrays;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        this(id, name, salary, 5, 5, 5); // varsayılan kapasiteler
    }

    public HRManager(long id, String name, double salary,
                     int juniorCapacity, int midCapacity, int seniorCapacity) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[Math.max(0, juniorCapacity)];
        this.midDevelopers = new MidDeveloper[Math.max(0, midCapacity)];
        this.seniorDevelopers = new SeniorDeveloper[Math.max(0, seniorCapacity)];
    }

    @Override
    public void work() {
        // örnek zam: +30%
        setSalary(getSalary() * 1.30);
        System.out.println("HRManager starts to working. New salary: " + getSalary());
    }

    // --------- Overloaded addEmployee (auto-index) ----------
    public void addEmployee(JuniorDeveloper dev) {
        addEmployee(dev, findFirstEmpty(juniorDevelopers));
    }

    public void addEmployee(MidDeveloper dev) {
        addEmployee(dev, findFirstEmpty(midDevelopers));
    }

    public void addEmployee(SeniorDeveloper dev) {
        addEmployee(dev, findFirstEmpty(seniorDevelopers));
    }

    // --------- Overloaded addEmployee (with index) ----------
    public void addEmployee(JuniorDeveloper dev, int index) {
        if (!checkIndex(juniorDevelopers, index)) return;
        if (juniorDevelopers[index] != null) {
            System.out.println("Warning: juniorDevelopers[" + index + "] is occupied. Not overwritten.");
            return;
        }
        juniorDevelopers[index] = dev;
    }

    public void addEmployee(MidDeveloper dev, int index) {
        if (!checkIndex(midDevelopers, index)) return;
        if (midDevelopers[index] != null) {
            System.out.println("Warning: midDevelopers[" + index + "] is occupied. Not overwritten.");
            return;
        }
        midDevelopers[index] = dev;
    }

    public void addEmployee(SeniorDeveloper dev, int index) {
        if (!checkIndex(seniorDevelopers, index)) return;
        if (seniorDevelopers[index] != null) {
            System.out.println("Warning: seniorDevelopers[" + index + "] is occupied. Not overwritten.");
            return;
        }
        seniorDevelopers[index] = dev;
    }

    // --------- Helpers ----------
    private <T> int findFirstEmpty(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) return i;
        }
        System.out.println("Warning: No empty slot available.");
        return -1;
    }

    private boolean checkIndex(Object[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Warning: Invalid index " + index + ". Capacity: " + arr.length);
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "juniorDevelopers=" + Arrays.toString(juniorDevelopers) +
                ", midDevelopers=" + Arrays.toString(midDevelopers) +
                ", seniorDevelopers=" + Arrays.toString(seniorDevelopers) +
                ", self=" + super.toString() +
                '}';
    }
}
