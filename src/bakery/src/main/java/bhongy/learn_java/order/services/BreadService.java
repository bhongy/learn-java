package bhongy.learn_java.order.services;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import bhongy.learn_java.order.models.Bread;

public class BreadService {
  private static final List<Bread> breads = Arrays.asList(
      new Bread(
          "br-498f",
          "Multi-grain Loaf",
          5.80),
      new Bread(
          "br-a7a2",
          "Dark Rye Loaf",
          5.20),
      new Bread(
          "br-c987",
          "Brioche Loaf",
          4.40));

  private static final Map<String, Bread> breadById = breads.stream()
      .collect(
          Collectors.toMap(Bread::getId, Function.identity()));

  public static List<Bread> listAll() {
    return breads;
  }

  public static Optional<Bread> getById(String id) {
    return Optional.ofNullable(breadById.get(id));
  }
}
