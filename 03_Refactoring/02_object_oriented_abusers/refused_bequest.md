# Object Oriented Abusers: Refused Bequest
```java
public class Bird {
    public void fly() {
        System.out.println("This bird is flying.");
    }
}

public class Penguin extends Bird {
    // Penguin tidak bisa terbang, tetapi tetap mewarisi method fly()
}
```

## Problem
Penguin adalah subkelas dari Bird, tetapi Penguin tidak bisa terbang. Namun, Penguin tetap mewarisi method fly() dari superclassnya.

## Solution (Refactored)
Pemeriksaan yang paling sederhana adalah dengan menghapus method fly() dari Penguin. Dengan cara ini, Penguin tidak akan mewarisi method fly() dari superclassnya.

```java
public interface Flyable {
    void fly();
}

public class FlyingBird implements Flyable {
    public void fly() {
        System.out.println("This bird is flying.");
    }
}

public class Penguin {
    // Tidak mengandung metode fly(), karena penguin tidak bisa terbang
    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}
```