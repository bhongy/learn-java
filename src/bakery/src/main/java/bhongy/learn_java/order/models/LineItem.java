package bhongy.learn_java.order.models;

import lombok.AccessLevel;
import lombok.Value;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Value
public class LineItem {
  Bread bread;
  int quantity;

  public double total() {
    return this.bread.getUnitPrice() * this.quantity;
  }
}
