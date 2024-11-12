package theAuthorandBookclasses;

public class Bookagain {
    private String name;
    private Author authors;
    private double price;
    private int qty = 0;
    public Bookagain( String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors[0];
        this.price = price;
    }
    public Bookagain( String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors[0];
        this.price = price;
        this.qty = qty;
    }
    public String getName(){
        return name;
    }









}
