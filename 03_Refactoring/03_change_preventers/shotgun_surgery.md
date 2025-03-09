# Change Preventers: Shotgun Surgery
```java
// Pajak dihitung langsung di Payroll
public class Payroll {
    private double baseSalary;

    public Payroll(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateNetSalary() {
        double tax = baseSalary * 0.10; // Pajak 10%
        return baseSalary - tax;
    }
}

// Pajak dihitung langsung di Invoice
public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public double calculateTotalAmount() {
        double tax = amount * 0.10; // Pajak 10%
        return amount + tax;
    }
}

// Pajak dihitung langsung di Finance
public class Finance {
    private double totalIncome;
    private double totalExpense;

    public Finance(double totalIncome, double totalExpense) {
        this.totalIncome = totalIncome;
        this.totalExpense = totalExpense;
    }

    public double calculateProfit() {
        double tax = totalIncome * 0.10; // Pajak 10%
        return (totalIncome - totalExpense) - tax;
    }
}
```

## Problem
Kelas `Payroll`, `Invoice`, dan `Finance` memiliki logika perhitungan pajak yang sama. Jika aturan perhitungan pajak berubah, kita harus mengubah ketiga kelas tersebut.

## Solution (Refactored)
Buat kelas `TaxCalculator` yang bertanggung jawab untuk menghitung pajak. Kelas `Payroll`, `Invoice`, dan `Finance` hanya memanggil `TaxCalculator` untuk menghitung pajak.
```java
// Kelas TaxCalculator untuk menangani perhitungan pajak
public class TaxCalculator {
    private static final double TAX_RATE = 0.12; // Pajak 12%

    public static double applyTax(double amount) {
        return amount * TAX_RATE;
    }
}

// Payroll hanya memanggil TaxCalculator
public class Payroll {
    private double baseSalary;

    public Payroll(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateNetSalary() {
        return baseSalary - TaxCalculator.applyTax(baseSalary);
    }
}

// Invoice hanya memanggil TaxCalculator
public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public double calculateTotalAmount() {
        return amount + TaxCalculator.applyTax(amount);
    }
}

// Finance hanya memanggil TaxCalculator
public class Finance {
    private double totalIncome;
    private double totalExpense;

    public Finance(double totalIncome, double totalExpense) {
        this.totalIncome = totalIncome;
        this.totalExpense = totalExpense;
    }

    public double calculateProfit() {
        return (totalIncome - totalExpense) - TaxCalculator.applyTax(totalIncome);
    }
}
```