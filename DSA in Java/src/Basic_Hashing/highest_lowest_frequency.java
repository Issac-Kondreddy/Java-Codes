package Basic_Hashing;

import java.util.*;

public class highest_lowest_frequency {
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
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find the highest and lowest frequency elements
        int highestFrequency = Integer.MIN_VALUE;
        int lowestFrequency = Integer.MAX_VALUE;
        int highestFrequencyElement = -1;
        int lowestFrequencyElement = -1;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            int element = entry.getKey();

            if (frequency > highestFrequency) {
                highestFrequency = frequency;
                highestFrequencyElement = element;
            }

            if (frequency < lowestFrequency) {
                lowestFrequency = frequency;
                lowestFrequencyElement = element;
            }
        }

        // Print the results
        System.out.println("Highest frequency element: " + highestFrequencyElement + " (Frequency: " + highestFrequency + ")");
        System.out.println("Lowest frequency element: " + lowestFrequencyElement + " (Frequency: " + lowestFrequency + ")");
    }
}

