# Dispansables: Lazy Class
```java
public class Discount {
    private double discountRate;

    public Discount(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}

public class Product {
    private String name;
    private double price;
    private Discount discount; // Menyimpan objek Discount

    public Product(String name, double price, Discount discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public double getFinalPrice() {
        return price - (price * discount.getDiscountRate());
    }
}
```

## Problem
Kelas `Discount` hanya memiliki satu metode `getDiscountRate` yang digunakan oleh kelas `Product`. Kelas `Discount` tidak melakukan banyak hal dan tidak memberikan nilai tambah. Kelas ini bisa dihapus dan metodenya bisa dipindahkan ke kelas `Product`.

## Solution (Refactored)
Hapus kelas `Discount` dan pindahkan metodenya ke kelas `Product`.
```java
public class Product {
    private String name;
    private double price;
    private double discountRate; // Langsung simpan nilai diskon

    public Product(String name, double price, double discountRate) {
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
    }

    public double getFinalPrice() {
        return price - (price * discountRate);
    }
}
```