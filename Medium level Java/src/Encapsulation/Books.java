package Encapsulation;

public class Books{
    private String ISPN;
    private String Author;
    private int year;

    Books(String ISPN, String Author, int year){
        this.ISPN = ISPN;
        this.Author = Author;
        this.year = year;
    }
    public String getISPN(){
        return ISPN;
    }
    public String getAuthor(){
        return Author;
    }
    public int getyear(){
        return year;
    }

    public void setISPN(String ISPN){
        ISPN = ISPN;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setYear(int year){
        year = year;
    }
}
