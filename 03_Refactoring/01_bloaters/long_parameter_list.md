# Bloater: Long Parameter List
```java
public void createUser(String name, String email, String phone, String address, String city, String zip, String country) {
    // Proses pembuatan user
}
```

## Problem
Metode `createUser` memiliki banyak parameter. Semakin banyak parameter yang dimiliki oleh sebuah metode, semakin sulit untuk memahami apa yang dilakukan metode tersebut.

## Solution (Refactored)
Refaktor metode `createUser` dengan membuat sebuah kelas baru yang berisi parameter-parameter tersebut.

```java
// /project/models/UserInfo.java
public class UserInfo {
    private String name;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String zip;
    private String country;

    public UserInfo(String name, String email, String phone, String address, String city, String zip, String country) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.country = country;
    }
}

// /project/services/UserService.java
public void createUser(UserInfo userInfo) {
    // Proses pembuatan user
}

public void updateUser(int id, UserInfo userInfo) {
    // Proses update user
}
```