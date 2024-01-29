package Encapsulation;

public class encapsulation {
    public static void main(String[] args) {
        //Encapsulation - attribution of a class will be hidden or private
        //can be accessed only through getter and setter
        Books book =new Books("1BN","Chetan Bhagat", 2021);
        //System.out.println(book.ISPN); //cant be accessed because of private
        //but once getter is set
        System.out.println(book.getAuthor());
        System.out.println(book.getyear());

        //to change private variable we need to use setter
        book.setAuthor("Issac");
        System.out.println(book.getAuthor());
    }
}

