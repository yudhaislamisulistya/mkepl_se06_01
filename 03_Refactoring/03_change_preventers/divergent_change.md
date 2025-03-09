# Change Preventers: Divergent Change
```java
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Perubahan untuk menangani data karyawan
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Perubahan untuk menghitung gaji
    public double calculateBonus() {
        return salary * 0.1;
    }

    // Perubahan untuk mengirim laporan ke HR
    public void sendReport() {
        System.out.println("Sending report for " + name);
    }
}
```

## Problem
Kelas `Employee` memiliki tiga alasan untuk berubah. Pertama, ketika ada perubahan pada data karyawan, seperti menambahkan alamat, tanggal lahir, atau informasi lainnya. Kedua, ketika ada perubahan pada perhitungan gaji, seperti menghitung bonus, tunjangan, atau potongan, ketiga, ketika ada perubahan pada pengiriman laporan ke HR, seperti mengirim laporan ke email, ke aplikasi, atau ke sistem lainnya.

## Solution (Refactored)
Pisahkan setiap alasan perubahan ke dalam kelas yang berbeda. Dalam contoh ini, kita memisahkan perhitungan bonus ke dalam kelas `Payroll` dan pengiriman laporan ke HR ke dalam kelas `HRReport`.
```java
public class Employee {
    private String name;
    private double dateOfBirth;
    private double salary;

    public Employee(String name, String dateOfBirth, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getDateOfBirth() {
        return dateOfBirth;
    }
}

// Kelas terpisah untuk perhitungan gaji
public class Payroll {
    public double calculateBonus(Employee employee) {
        return employee.getSalary() * 0.1;
    }
}

// Kelas terpisah untuk laporan HR
public class HRReport {
    public void sendReport(Employee employee) {
        System.out.println("Sending report for " + employee.getName());
    }
}
```
