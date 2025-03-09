# Dispansables: Speculative Generality
```java
public class PaymentProcessor<T> {
    public void processPayment(T paymentType) {
        System.out.println("Processing payment of type: " + paymentType);
    }
}
```

## Problem
Kelas `PaymentProcessor` memiliki parameter generik `T` yang tidak digunakan di dalam metode `processPayment`. Parameter ini tidak perlu dan hanya menambahkan kebingungan.

## Solution (Refactored)
Hapus parameter generik `T` karena tidak digunakan.
```java
public class PaymentProcessor {
    public void processPayment() {
        System.out.println("Processing payment");
    }
}
```