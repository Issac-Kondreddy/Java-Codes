import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> ages = new HashMap<>();

        // Add key-value pairs to the HashMap
        ages.put("John", 30);
        ages.put("Alice", 25);
        ages.put("Bob", 35);

        // Retrieve values from the HashMap
        System.out.println("John's age is: " + ages.get("John")); // Output: John's age is: 30
        System.out.println("Alice's age is: " + ages.get("Alice")); // Output: Alice's age is: 25
        System.out.println("Bob's age is: " + ages.get("Bob")); // Output: Bob's age is: 35

        // Modify a value in the HashMap
        ages.put("John", 32);
        System.out.println("John's new age is: " + ages.get("John")); // Output: John's new age is: 32

        // Remove a key-value pair from the HashMap
        ages.remove("Alice");
        System.out.println("Alice's age has been removed: " + ages.get("Alice")); // Output: Alice's age has been removed: null
    }
}
