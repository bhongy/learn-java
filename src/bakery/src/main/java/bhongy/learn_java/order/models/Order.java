package bhongy.learn_java.order.models;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

import lombok.Data;

@Data
public class Order {
  private final String id;

  private Map<Bread, LineItem> lineItems = new LinkedHashMap<>();
  private Payment payment;

  public boolean isEmpty() {
    return this.lineItems.isEmpty();
  }

  public boolean isPaid() {
    return this.payment != null;
  }

  public double total() {
    return this.lineItems
        .values()
        .stream()
        .mapToDouble(LineItem::total)
        .sum();
  }

  public Order add(Bread bread) {
    return this.add(bread, 1);
  }

  public Order add(Bread bread, int qty) {
    int prevQty = Optional
      .ofNullable(this.lineItems.get(bread))
      .map(prev -> prev.getQuantity())
      .orElse(0);

    this.lineItems.put(bread,
      new LineItem(bread, prevQty + qty));

    return this;
  }
}
