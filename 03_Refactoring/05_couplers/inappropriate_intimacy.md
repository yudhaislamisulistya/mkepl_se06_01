# Couplers: Inappropriate Intimacy
```java
public class Husband {
    private String secretThoughts = "I love coding more than anything.";

    public String getSecretThoughts() {
        return secretThoughts;
    }
}

public class Wife {
    private Husband husband;

    public Wife(Husband husband) {
        this.husband = husband;
    }

    public void readHusbandThoughts() {
        System.out.println("Reading Husband's thoughts: " + husband.getSecretThoughts());
    }
}
```

## Problem
Kelas `Wife` memiliki ketergantungan yang kuat dengan kelas `Husband`. Kelas `Wife` dapat mengakses data `Husband` secara langsung.

## Solution (Refaactored)
```java
public class Husband {
    private String secretThoughts = "I love coding more than anything.";

    public void shareFeelings() {
        System.out.println("I feel great today!");
    }
}

public class Wife {
    private Husband husband;

    public Wife(Husband husband) {
        this.husband = husband;
    }

    public void askHusbandFeeling() {
        husband.shareFeelings();
    }
}
```