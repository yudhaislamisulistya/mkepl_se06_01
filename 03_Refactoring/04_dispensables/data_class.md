# Dispansables: Data Class
```java
public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
```

## Problem
Kelas `Product` hanya memiliki atribut dan metode getter. Kelas ini tidak memiliki metode lain yang memanipulasi atributnya. Kelas ini tidak memberikan nilai tambah dan hanya sebagai wadah untuk data.

## Solution (Refactored)
Kita menambahkan metode yang memanipulasi atribut kelas `Product`. Dalam contoh ini, kita menambahkan metode `applyDiscount` yang menghitung harga produk setelah diskon.
```java
public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double applyDiscount(double discountRate) {
        return price - (price * discountRate);
    }
}
```