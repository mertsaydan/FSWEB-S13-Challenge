package org.example;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }


    public void addHealthPlan(int index, String name) {
        try {
            if (healthPlans[index] == null) {
                healthPlans[index] = name;
                System.out.println("Healthplan başarıyla eklendi: " + name);
            } else {
                System.out.println("Hata: Belirtilen index (" + index + ") zaten dolu! Mevcut değer: " + healthPlans[index]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Geçersiz index (" + index + "). Dizi boyutu dışında!");
        }
    }


    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }


    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override
    public String toString() {
        return "Employee [ID: " + id + ", Name: " + fullName + ", Email: " + email + ", Healthplans: " + Arrays.toString(healthPlans) + "]";
    }
}