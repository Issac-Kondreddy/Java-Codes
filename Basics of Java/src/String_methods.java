public class String_methods {
    public static void main(String[] args) {
        //string - a reference data types that can store one or more characters
        String name = "Issac";
        boolean result = name.equals("Issac");
        System.out.println(result);
        boolean result1 = name.equalsIgnoreCase("issac");
        System.out.println(result1);

        int size = name.length();
        System.out.println(size);

        char result2 = name.charAt(2);
        System.out.println(result2);

        int result4 = name.indexOf("s");
        System.out.println(result4);

        boolean result5 = name.isEmpty();
        System.out.println(result5);

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name.concat(" Kondreddy"));

        System.out.println(name.replace("Issac","Vissu"));
    }
}
