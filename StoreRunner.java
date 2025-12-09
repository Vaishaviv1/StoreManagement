import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    Drink d1 = new Drink("Milk Tea", 5.99, "Drink 1", "Large");
    Drink d2 = new Drink("Matcha", 4.75, "Drink 2", "Medium");

    Snack s1 = new Snack("Donut", 2.99, "Snack 1", "Chocolate");
    Snack s2 = new Snack("Cake", 3.99, "Snack 2", "Vanilla");

    System.out.println(d1);
    System.out.println(d2);
    System.out.println(s1);
    System.out.println(s2);

    System.out.print("Make a drink name: ");
    String n = input.nextLine();

    System.out.print("Price: ");
    double p = input.nextDouble();
    input.nextLine();

    System.out.print("Product ID: ");
    String i = input.nextLine();

    System.out.print("Size: ");
    String s = input.nextLine();

    Drink d3 = new Drink(n, p, i, s);

    System.out.println("You made: " + d3);

    input.close();
  }
}
