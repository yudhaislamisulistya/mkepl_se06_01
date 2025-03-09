# Couplers: Message Chains
```java
public class Address {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}

public class Customer {
    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}

public class Order {
    private Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void printCustomerCity() {
        System.out.println("Customer city: " + customer.getAddress().getCity());
    }
}
```

## Problem
Kelas `Order` memiliki method `printCustomerCity` yang memanggil method `getCity` dari kelas `Address` yang ada di dalam kelas `Customer`. Hal ini membuat kelas `Order` menjadi terlalu tergantung dengan kelas `Customer` dan `Address`.

## Solution (Refactored)
Kita dapat mengubah method `printCustomerCity` pada kelas `Order` agar tidak terlalu tergantung dengan kelas `Customer` dan `Address` dengan menambahkan method `getCity` pada kelas `Customer`.
```java
public class Customer {
    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public String getCity() {
        return address.getCity();
    }
}

public class Order {
    private Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void printCustomerCity() {
        System.out.println("Customer city: " + customer.getCity());
    }
}
```