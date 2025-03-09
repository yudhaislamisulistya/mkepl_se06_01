
# Bloater: Long Method
```java
public void processOrder(Order order) {
    // Validasi order
    if (order == null || order.getItems().isEmpty()) {
        throw new IllegalArgumentException("Order tidak valid");
    }

    // Hitung total harga
    double total = 0;
    for (Item item : order.getItems()) {
        total += item.getPrice();
    }

    // Terapkan diskon jika berlaku
    if (total > 1000) {
        total *= 0.9; // Diskon 10%
    }

    // Simpan ke database
    Database.save(order);

    // Kirim email notifikasi
    EmailService.sendEmail(order.getCustomerEmail(), "Order Anda telah diproses.");
}
```

## Problem
Metode `processOrder` memiliki proses yang cukup panjang. Metode yang panjang seperti ini akan sulit untuk dipahami dan dikelola. Selain itu, metode yang panjang juga cenderung memiliki banyak tanggung jawab yang berbeda.

## Solution (Refactored)
Pemecahan masalah yang paling sederhana adalah dengan memecah metode menjadi beberapa metode yang lebih kecil. Setiap metode yang lebih kecil akan bertanggung jawab atas satu tugas tertentu. Dengan cara ini, metode akan menjadi lebih mudah dipahami dan dikelola.

```java
public void processOrder(Order order) {
    validateOrder(order);
    double total = calculateTotal(order);
    total = applyDiscount(total);
    saveOrder(order);
    sendNotification(order);
}

private void validateOrder(Order order) {
    if (order == null || order.getItems().isEmpty()) {
        throw new IllegalArgumentException("Order tidak valid");
    }
}

private double calculateTotal(Order order) {
    return order.getItems().stream().mapToDouble(Item::getPrice).sum();
}

private double applyDiscount(double total) {
    return total > 1000 ? total * 0.9 : total;
}

private void saveOrder(Order order) {
    Database.save(order);
}

private void sendNotification(Order order) {
    EmailService.sendEmail(order.getCustomerEmail(), "Order Anda telah diproses.");
}
```