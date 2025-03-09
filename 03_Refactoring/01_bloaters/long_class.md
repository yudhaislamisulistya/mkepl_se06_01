# Bloater: Long Class
```java
public class Order {
    // Atribut
    private List<Order> orders;

    // Metode Order
    public void addOrder(Order order) {
        orders.add(order);
    }

    // Metode Hapus Order
    public void removeOrder(Order order) {
        orders.remove(order);
    }

    // Metode Hitung Total
    public void calculateTotal(Order order) {
        double total = order.getItems().stream().mapToDouble(Item::getPrice).sum();
        System.out.println("Total: " + total);
    }

    // Metode Send Notification
    public void sendOrderNotification(Order order) {
        EmailService.sendEmail(order.getCustomerEmail(), "Order Anda telah dikirim.");
    }

    // Metode Simpan Order ke Database
    public void saveOrder(Order order) {
        Database.save(order);
    }
}
```

## Problem
Kelas `Order` memiliki banyak metode yang berbeda. Kelas yang panjang seperti ini akan sulit untuk dipahami dan dikelola. Selain itu, kelas yang panjang juga cenderung memiliki banyak tanggung jawab yang berbeda.

## Solution (Refactored)
Pemecahan masalah yang paling sederhana adalah dengan memecah kelas menjadi beberapa kelas yang lebih kecil. Setiap kelas yang lebih kecil akan bertanggung jawab atas satu tugas tertentu. Dengan cara ini, kelas akan menjadi lebih mudah dipahami dan dikelola.

```java
public class OrderService {
    private List<Order> orders;

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }
}

public class OrderProcessor {
    public double calculateTotal(Order order) {
        return order.getItems().stream().mapToDouble(Item::getPrice).sum();
    }
}

public class OrderNotifier {
    public void sendOrderNotification(Order order) {
        EmailService.sendEmail(order.getCustomerEmail(), "Order Anda telah dikirim.");
    }
}

public class OrderRepository {
    public void saveOrder(Order order) {
        Database.save(order);
    }
}
```