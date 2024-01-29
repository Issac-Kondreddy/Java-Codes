package Objects_copying;
public class book{
    private String ISPN;
    private String Author;
    private int year;

    book(String ISPN, String Author, int year){
        this.ISPN = ISPN;
        this.Author = Author;
        this.year = year;
    }
    book(book x){
        this.copy(x);
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

    public void setISPN(String ispn){
        ISPN = ispn;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setYear(int Year){
        year = Year;
    }
    public void copy(book x){
        this.setISPN(x.getISPN());
        this.setAuthor(x.getAuthor());
        this.setYear(x.getyear());
    }
}
