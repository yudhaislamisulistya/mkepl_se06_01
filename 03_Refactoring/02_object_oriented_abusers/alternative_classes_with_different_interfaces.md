
# Object Oriented Abusers: Alternative Classes with Different Interfaces
```java
public class EmailSender {
    public void sendEmail(String recipient, String message) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}

public class SmsSender {
    public void sendSMS(String phoneNumber, String text) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + text);
    }
}
```

## Problem
Kelas `EmailSender` dan `SmsSender` memiliki metode yang memiliki tujuan yang sama, yaitu mengirim pesan ke penerima. Namun, kedua kelas ini memiliki nama metode yang berbeda.

## Solution (Refactored)
Pemecahan masalah yang paling sederhana adalah dengan membuat interface baru yang berisi metode yang sama. Dengan cara ini, kita dapat mengelompokkan metode-metode yang memiliki tujuan yang sama ke dalam satu interface.

```java
public interface MessageSender {
    void sendMessage(String recipient, String message);
}

public class EmailSender implements MessageSender {
    public void sendMessage(String recipient, String message) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}

public class SmsSender implements MessageSender {
    public void sendMessage(String recipient, String message) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}
```