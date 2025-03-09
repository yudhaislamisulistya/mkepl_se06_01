# Dispansables: Comments
```java
public class MathUtils {
    // Metode ini menghitung kuadrat dari sebuah angka
    public int square(int number) {
        return number * number; // Mengalikan angka dengan dirinya sendiri
    }
}
```

## Problem
Kelas `MathUtils` memiliki komentar yang menjelaskan apa yang dilakukan oleh metode `square`. Komentar ini tidak perlu karena metode `square` sudah cukup jelas. Komentar ini hanya menambahkan kebisingan dan tidak memberikan nilai tambah.

## Solution (Refactored)
Hapus komentar yang tidak perlu.
```java
public class MathUtils {
    public int square(int number) {
        return number * number;
    }
}
```