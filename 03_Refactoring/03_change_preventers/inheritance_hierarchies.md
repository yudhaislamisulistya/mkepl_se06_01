# Change Preventers: Inheritance Hierarchies
```java
// public class Employee { }
// public class Manager extends Employee { }
// public class Developer extends Employee { }

// public class Payroll { }
// public class ManagerPayroll extends Payroll { }
// public class DeveloperPayroll extends Payroll { }

// Hierarki Employee
public class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}

public class Manager extends Employee {
    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }
}

public class Developer extends Employee {
    public Developer(String name, double baseSalary) {
        super(name, baseSalary);
    }
}

// Hierarki Payroll
public class Payroll {
    protected Employee employee;

    public Payroll(Employee employee) {
        this.employee = employee;
    }

    public double calculateSalary() {
        return employee.getBaseSalary();
    }
}

public class ManagerPayroll extends Payroll {
    public ManagerPayroll(Employee employee) {
        super(employee);
    }

    @Override
    public double calculateSalary() {
        return employee.getBaseSalary() + 5000; // Bonus untuk Manager
    }
}

public class DeveloperPayroll extends Payroll {
    public DeveloperPayroll(Employee employee) {
        super(employee);
    }

    @Override
    public double calculateSalary() {
        return employee.getBaseSalary() + 2000; // Bonus untuk Developer
    }
}

// Contoh Penggunaan
public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 50000);
        Employee developer = new Developer("Bob", 40000);

        Payroll managerPayroll = new ManagerPayroll(manager);
        Payroll developerPayroll = new DeveloperPayroll(developer);

        System.out.println("Manager Salary: " + managerPayroll.calculateSalary());
        System.out.println("Developer Salary: " + developerPayroll.calculateSalary());
    }
}
```

## Problem
Kita memiliki hierarki kelas `Employee` dan `Payroll`. `Employee` memiliki dua turunan, yaitu `Manager` dan `Developer`. Sedangkan `Payroll` juga memiliki dua turunan, yaitu `ManagerPayroll` dan `DeveloperPayroll`. Setiap turunan dari `Payroll` memiliki implementasi `calculateSalary` yang berbeda.

## Solution (Refactored)
Kita dapat menggunakan strategi untuk menghindari hierarki kelas yang berlebihan. Kita dapat membuat interface `PayrollStrategy` yang memiliki satu metode `calculateSalary`. Kemudian, kita membuat implementasi dari interface tersebut untuk setiap jenis `Employee`. Setiap `Employee` akan memiliki strategi gaji yang berbeda.
```java
// Interface untuk strategi gaji
public interface PayrollStrategy {
    double calculateSalary(Employee employee);
}

// Implementasi untuk Manager
public class ManagerPayroll implements PayrollStrategy {
    public double calculateSalary(Employee employee) {
        return 5000; // Contoh perhitungan
    }
}

// Implementasi untuk Developer
public class DeveloperPayroll implements PayrollStrategy {
    public double calculateSalary(Employee employee) {
        return 4000; // Contoh perhitungan
    }
}

// Kelas Employee
public class Employee {
    private String name;
    private PayrollStrategy payrollStrategy;

    public Employee(String name, PayrollStrategy payrollStrategy) {
        this.name = name;
        this.payrollStrategy = payrollStrategy;
    }

    public double getSalary() {
        return payrollStrategy.calculateSalary(this);
    }
}
```