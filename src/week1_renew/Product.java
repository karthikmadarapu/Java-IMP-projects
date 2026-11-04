package week1_renew;

public class Product {
    private String name;
    private double price;
    private String id;



    public Product(String name, double price, String id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getName(){return name;}
    public double getPrice(){return price;}
    public String getId(){return id;}
}
