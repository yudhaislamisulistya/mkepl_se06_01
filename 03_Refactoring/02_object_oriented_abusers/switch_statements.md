# Object Oriented Abusers: Switch Statements
```java
public class PaymentProcessor {
    public void processPayment(String paymentType) {
        switch (paymentType) {
            case "credit_card":
                System.out.println("Processing credit card payment...");
                break;
            case "paypal":
                System.out.println("Processing PayPal payment...");
                break;
            case "bank_transfer":
                System.out.println("Processing bank transfer...");
                break;
            default:
                throw new IllegalArgumentException("Unknown payment type");
        }
    }
}
```

## Problem
Kode di atas menggunakan switch statement untuk memilih tindakan yang sesuai berdasarkan tipe pembayaran. Jika kita menambahkan tipe pembayaran baru, kita harus memodifikasi kelas ini dan menambahkan case baru ke dalam switch statement.

## Solution (Refactored)
Kita dapat menggunakan polimorfisme untuk menghindari switch statement. Buat interface PaymentProcessor dan implementasikan kelas-kelas yang sesuai untuk setiap tipe pembayaran.

```java
public interface Payment {
    void processPayment();
}

public class CreditCardPayment implements Payment {
    public void processPayment() {
        System.out.println("Processing credit card payment...");
    }
}

public class PayPalPayment implements Payment {
    public void processPayment() {
        System.out.println("Processing PayPal payment...");
    }
}

public class BankTransferPayment implements Payment {
    public void processPayment() {
        System.out.println("Processing bank transfer...");
    }
}

public class PaymentProcessor {
    public void processPayment(Payment payment) {
        payment.processPayment();
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment(new CreditCardPayment());
        processor.processPayment(new PayPalPayment());
        processor.processPayment(new BankTransferPayment());
    }
}
```
