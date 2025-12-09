public class Product {
    private String name;
    private double price;
    private String id;

    public Product(String n, double p, String i) {
        name = n;
        price = p;
        id = i;
    }

    // 👉 add these three methods:
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return "Name: " + name +
               "\nPrice: " + price +
               "\nID: " + id;
    }
}
