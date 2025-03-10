# Object Oriented Abusers: Temporary Field
```java
public class Employee {
    private String name;
    private double salary;
    private double bonus; // Hanya digunakan saat akhir tahun

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getTotalSalary() {
        if (bonus != null) {
            return salary + bonus;
        }
        return salary;
    }
}

```

## Problem
Kelas `Employee` memiliki atribut `bonus` yang hanya digunakan saat akhir tahun. Atribut ini hanya digunakan dalam satu metode, yaitu `getTotalSalary()`. Atribut ini tidak digunakan dalam metode lainnya.

## Solution (Refactored)
Kita dapat membuat kelas baru yang bertanggung jawab untuk menghitung bonus. Dengan cara ini, kita dapat memisahkan tanggung jawab kelas `Employee` dan `BonusCalculator`.

```java
public class BonusCalculator {
    private double bonus;

    public BonusCalculator(double bonus) {
        this.bonus = bonus;
    }

    public double applyBonus(double salary) {
        return salary + bonus;
    }
}

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getTotalSalaryWithBonus(double bonusAmount) {
        BonusCalculator bonusCalculator = new BonusCalculator(bonusAmount);
        return bonusCalculator.applyBonus(salary);
    }

    public double getTotalSalary(){
        return salary;
    }
}
```