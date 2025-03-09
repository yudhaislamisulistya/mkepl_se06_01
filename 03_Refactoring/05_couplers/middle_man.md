# Couplers: Middle Man
```java
public class Database {
    public void save(String data) {
        System.out.println("Saving data: " + data);
    }
}

public class DataService {
    private Database database;

    public DataService(Database database) {
        this.database = database;
    }

    public void saveData(String data) {
        database.save(data);
    }
}

public class App {
    public static void main(String[] args) {
        Database db = new Database();
        DataService service = new DataService(db);
        service.saveData("User Info");
    }
}
```

## Problem
Kelas `DataService` hanya memiliki satu metode yang memanggil metode dari kelas lain. Kelas ini tidak memiliki tanggung jawab lain selain memanggil metode dari kelas lain. Kelas ini tidak perlu ada, karena kelas `App` bisa langsung memanggil metode dari kelas `Database`.

## Solution (Refactored)
Hapus kelas `DataService` dan panggil metode `save` dari kelas `Database` langsung dari kelas `App`.
```java
public class Database {
    public void save(String data) {
        System.out.println("Saving data: " + data);
    }
}

public class App {
    public static void main(String[] args) {
        Database db = new Database();
        db.save("User Info");
    }
}
```