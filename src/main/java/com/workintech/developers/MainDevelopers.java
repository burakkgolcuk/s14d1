package com.workintech.developers;

public class MainDevelopers {
    public static void main(String[] args) {
        HRManager hr = new HRManager(1, "Burak", 30000, 2, 2, 2);

        JuniorDeveloper j1 = new JuniorDeveloper(2, "Ali", 15000);
        MidDeveloper m1 = new MidDeveloper(3, "Ayşe", 20000);
        SeniorDeveloper s1 = new SeniorDeveloper(4, "Can", 30000);

        hr.addEmployee(j1);          // otomatik ilk boş index
        hr.addEmployee(m1, 1);       // belirtilen index
        hr.addEmployee(s1, 0);

        j1.work();
        m1.work();
        s1.work();
        hr.work();

        System.out.println(hr);
    }
}
