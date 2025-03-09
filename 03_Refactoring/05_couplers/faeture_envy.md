# Couplers: Feature Envy
```java
public class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

public class Order {
    private Customer customer;
    private double amount;

    public Order(Customer customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public void printReceipt() {
        System.out.println("Receipt for " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Amount: $" + amount);
    }
}
```

## Problem
Kelas `Order` memiliki fitur yang seharusnya dimiliki oleh kelas `Customer`. Kelas `Order` memiliki fitur untuk mencetak receipt dan mengakses data `Customer` seperti nama dan email.

## Solution (Refaactored)
```java
public class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getCustomerInfo() {
        return name + " (Email: " + email + ")";
    }
}

public class Order {
    private Customer customer;
    private double amount;

    public Order(Customer customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public void printReceipt() {
        System.out.println("Receipt for " + customer.getCustomerInfo());
        System.out.println("Amount: $" + amount);
    }
}
```