# Dispansables: Duplicate Code
```java
public class Rectangle {
    private double width, height;

    public double calculateArea() {
        return width * height;
    }
}

public class Triangle {
    private double base, height;

    public double calculateArea() {
        return (base * height) / 2;
    }
}
```

## Problem
Kelas `Rectangle` dan `Triangle` memiliki metode `calculateArea` yang memiliki implementasi yang sama. Hal ini menandakan adanya duplikasi kode.

## Solution (Refactored)
Buat kelas `Shape` yang memiliki metode `calculateArea` dan jadikan `Rectangle` dan `Triangle` sebagai subclass dari `Shape
```java
public abstract class Shape {
    public abstract double calculateArea();
}

public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class Triangle extends Shape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }
}
```