package Objects_copying;

public class objects_copy {
    public static void main(String[] args) {
        book book1 = new book("123", "Chetan Baghat", 2021);
        book book2 = new book("1234", "Chetan", 2022);
        book book3 = new book(book1);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println();

        System.out.println(book1.getAuthor());
        System.out.println(book1.getISPN());
        System.out.println(book1.getyear());
        System.out.println();

        System.out.println(book2.getAuthor());
        System.out.println(book2.getISPN());
        System.out.println(book2.getyear());
        System.out.println();

        //book1 = book2; this is wrong
        //book2.copy(book1); make a copy method

        System.out.println(book3.getAuthor());
        System.out.println(book3.getISPN());
        System.out.println(book3.getyear());
    }
}
