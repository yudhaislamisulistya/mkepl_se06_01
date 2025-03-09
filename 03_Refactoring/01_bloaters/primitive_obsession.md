# Bloater: Primitive Obsession
```java
public class Customer {
    private String name;
    private String email;
    private String phone;
}
```

## Problem
Kelas `Customer` memiliki beberapa atribut yang bertipe data primitif atau non-primitive, seperti `String` untuk nama, email, nomor telepon, dan alamat. Penggunaan tipe data primitif ini dapat menyebabkan kode menjadi sulit dipahami dan dikelola (sebenarnya bukan sulit untuk dipahami, tapi lebih kepada kurang memanfaatkan fitur-fitur yang ada di programming itu sendiri).

## Solution (Refactored)
Pemecahan masalah yang paling sederhana adalah dengan mengganti tipe data primitif dengan kelas yang sesuai. Dalam kasus ini, kita dapat membuat kelas `Email`, `PhoneNumber` untuk menggantikan tipe data `String` pada atribut `email` dan `phone`. Dengan cara ini, kita dapat menambahkan validasi dan operasi lain yang berkaitan dengan email dan nomor telepon ke dalam kelas tersebut.

```java
public class Email {
    private String email;

    public Email(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email tidak valid");
        }
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}

public class PhoneNumber {
    private String number;

    public PhoneNumber(String number) {
        if (!number.matches("\\d{10,12}")) {
            throw new IllegalArgumentException("Nomor telepon tidak valid");
        }
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}

public class Customer {
    private String name;
    private Email email;
    private PhoneNumber phone;
}
```