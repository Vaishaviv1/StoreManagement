// Drink.java
public class Drink extends Product {

    private String size;

    public Drink(String n, double p, String i, String s) {
        super(n, p, i);
        size = s;
    }

    public String toString() {
        return "Name: " + getName() +
               "\nPrice: " + getPrice() +
               "\nID: " + getId() +
               "\nSize: " + size;
    }
}
