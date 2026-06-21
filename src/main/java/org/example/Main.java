package org.example;

import org.example.enums.Plan;

public class Main {

    public static void main(String[] args) {

        runApp();
    }

    public static void runApp() {
        System.out.println("--- UYGULAMA BAŞLATILDI ---\n");


        System.out.println("=== 1. Healthplan Nesnesi Oluşturuluyor ===");
        HealthPlan healthplan1 = new HealthPlan(1, "A Sigorta", Plan.PREMIUM);
        System.out.println(healthplan1.toString());
        System.out.println();

        System.out.println("=== 2. Employee Nesnesi ve Metot Testleri ===");

        String[] empPlans = new String[2];
        Employee employee = new Employee(101, "Ahmet Yılmaz", "ahmet@firma.com", "123456", empPlans);


        employee.addHealthPlan(0, "A Sigorta");


        employee.addHealthPlan(0, "B Sigorta");


        employee.addHealthPlan(5, "C Sigorta");


        System.out.println("Employee toString() Çıktısı:");
        System.out.println(employee.toString());
        System.out.println();


        System.out.println("=== 3. Company Nesnesi ve Metot Testleri ===");

        String[] devs = new String[3];


        Company company = new Company(501, "Teknoloji A.Ş.", -50000.0, devs);


        company.addEmployee(0, "Ahmet Yılmaz");
        company.addEmployee(1, "Mehmet Demir");


        company.addEmployee(1, "Canan Kaya");


        company.addEmployee(-1, "Selin Öz");


        System.out.println("Company toString() Çıktısı:");
        System.out.println(company.toString());

        System.out.println("\n--- UYGULAMA BİTTİ ---");
    }
}