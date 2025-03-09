# Bloater: Data Clumps
```java
public class User {
    private String name;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    public User(String name, String street, String city, String state, String zipCode, String country) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public void printAddress() {
        System.out.println(street + ", " + city + ", " + state + " " + zipCode + ", " + country);
    }
}
```

## Problem
Kelas `User` memiliki beberapa atribut yang selalu digunakan bersama-sama. Atribut-atribut ini membentuk kelompok data yang disebut _data clumps_. Data clumps sering kali muncul karena atribut-atribut tersebut memiliki hubungan yang erat satu sama lain.

## Solution (Refactored)
Pemecahan masalah yang paling sederhana adalah dengan membuat kelas baru yang berisi atribut-atribut tersebut. Dengan cara ini, kita dapat mengelompokkan atribut-atribut yang saling berhubungan ke dalam satu kelas.

```java
public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    public Address(String street, String city, String state, String zipCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String getFullAddress() {
        return street + ", " + city + ", " + state + " " + zipCode + ", " + country;
    }
}

public class User {
    private String name;
    private Address address;

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void printAddress() {
        System.out.println(address.getFullAddress());
    }
}
```