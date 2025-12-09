// Snack.java
public class Snack extends Product {

    private String flavor;

    public Snack(String n, double p, String i, String f) {
        super(n, p, i);
        flavor = f;
    }

    public String toString() {
        return "Name: " + getName() +
               "\nPrice: " + getPrice() +
               "\nID: " + getId() +
               "\nFlavor: " + flavor;
    }
}
