package Hashing;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> names = new HashMap<>();
        names.put(1, "Issac");
        names.put(2, "Bharadwaj");
        names.put(3, "Pranay");
        names.put(4, "Suhas");
        names.put(5, "Sulthan");
        System.out.println(names.keySet());
        System.out.println(names.entrySet());
        System.out.println(names.size());
        System.out.println(names.isEmpty());
        System.out.println(names.values());
        names.put(6,"Tharun");
        names.put(7,"Nandha");
        names.put(8, "Vikram");
        System.out.println(names.values());
        System.out.println(names.get(3));
        names.putIfAbsent(9, "Karthik");
        System.out.println(names.values());

    }
}
