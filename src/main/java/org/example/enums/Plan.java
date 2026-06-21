package org.example.enums;

public enum Plan {
    // Fiyat değerlerini tam sayı (int) olarak güncelledik (Örn: 1000.0 yerine 1000)
    BASIC("Basic Health Plan", 1000),
    PREMIUM("Premium Health Plan", 3000),
    VIP("VIP Health Plan", 5000);

    private final String name;
    private final int price; // double olan tip int olarak değiştirildi


    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }


    public int getPrice() {
        return price;
    }
}