package org.example;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
    private String Brand;

    public String getBrand() {
        return Brand;
    }

    public Tyre() {
    }

    public Tyre(String brand) {
        Brand = brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    @Override
    public String toString() {
        return "tyre is working";
    }
}