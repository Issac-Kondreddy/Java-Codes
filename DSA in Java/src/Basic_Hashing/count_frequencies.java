package Basic_Hashing;

import java.util.*;

public class count_frequencies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Create the array
        int[] arr = new int[n];

        // Read the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create a HashMap to store frequencies
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequencies
        for (int num : arr) {
            if (frequencyMap.containsKey(num)) {
                // If the number is already present, increment its count
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                // If the number is encountered for the first time, add it with count 1
                frequencyMap.put(num, 1);
            }
        }

        // Print the frequencies
        System.out.println("Frequencies of elements:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }
}
