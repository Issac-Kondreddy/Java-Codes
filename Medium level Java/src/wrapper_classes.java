public class wrapper_classes {
    public static void main(String[] args) {
        //wrapper class - provides a way to use primitive data types as a reference data types like they can have methods to use
        // int  - Integer
        //boolean - Boolean
        //double - Double
        //char - Character

        //auto boxing - the automatic conversion by compiler from primitive to object wrapper class
        //unboxing - the reverse of autoboxing

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Issac Kondreddy"; //already a reference data types
        System.out.println(a.booleanValue());
        System.out.println(a.compareTo(false));
        System.out.println(b.charValue());
        System.out.println(b.getClass());
        System.out.println(c.getClass());
        System.out.println(d.compareTo(3.14));

    }
}
