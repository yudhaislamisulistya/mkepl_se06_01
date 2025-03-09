# Dispansables: Dead Code
```java
public class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public void oldMethod() {
        // Tidak pernah dipanggil di mana pun
        System.out.println("This method is obsolete.");
    }
}
```

## Problem
Kelas `User` memiliki metode `oldMethod` yang tidak pernah dipanggil di mana pun dalam kode. Metode ini tidak memberikan nilai tambah dan hanya menambahkan kebisingan.

## Solution (Refactored)
Hapus metode `oldMethod` karena tidak pernah dipanggil.
```java
public class User {
    private String username;

    public User(String username) {
        this.username = username;
    }
}
```