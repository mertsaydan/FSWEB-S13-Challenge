package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;


    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        setGiro(giro); // Giro 0'dan küçük olmasın diye setter üzerinden atama yapıyoruz
        this.developerNames = developerNames;
    }


    public void addEmployee(int index, String name) {
        try {
            if (developerNames[index] == null) {
                developerNames[index] = name;
                System.out.println("Geliştirici başarıyla eklendi: " + name);
            } else {
                System.out.println("Hata: Belirtilen index (" + index + ") zaten dolu! Mevcut değer: " + developerNames[index]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Geçersiz index (" + index + "). Dizi boyutu dışında!");
        }
    }


    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getGiro() { return giro; }
    public void setGiro(double giro) {
        if (giro < 0) {
            System.out.println("Giro 0'dan küçük olamaz! Giro 0 olarak ayarlandı.");
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }

    public String[] getDeveloperNames() { return developerNames; }
    public void setDeveloperNames(String[] developerNames) { this.developerNames = developerNames; }


    @Override
    public String toString() {
        return "Company [ID: " + id + ", Name: " + name + ", Giro: " + giro + ", Developers: " + Arrays.toString(developerNames) + "]";
    }
}