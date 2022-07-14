package structure;

public class Structure {
  public static void displayItem(Item item) {
    System.out.println(
        item.name + " costs " + item.price
            + " and we have " + item.quantity
            + " of them.");
  }

  public static void main(String[] args) {
    Item car = new Item();
    car.name = "Car";
    car.price = 10000;
    car.quantity = 1;

    Item choc = new Item();
    choc.name = "Box of chocolate";
    choc.price = 10;
    choc.quantity = 16;

    displayItem(car);
    displayItem(choc);
  }
}
