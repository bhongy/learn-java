package bhongy.learn_java.order.models;

import lombok.Value;

@Value
public class LineItem {
  Bread bread;
  int quantity;

  public double total() {
    return this.bread.getUnitPrice() * this.quantity;
  }
}
