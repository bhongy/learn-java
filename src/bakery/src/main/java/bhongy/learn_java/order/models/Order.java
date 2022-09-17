package bhongy.learn_java.order.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Order {
  private final String id;

  private List<LineItem> lineItems = new ArrayList<>();
  private Payment payment;

  public boolean isPaid() {
    return this.payment != null;
  }

  public double total() {
    return this.lineItems.stream()
        .mapToDouble(LineItem::total)
        .sum();
  }

  public Order add(Bread bread) {
    this.lineItems.add(new LineItem(bread, 1));
    return this;
  }

  public Order add(Bread bread, int qty) {
    this.lineItems.add(new LineItem(bread, qty));
    return this;
  }
}
