package bhongy.learn_java.bakery;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import bhongy.learn_java.order.models.Bread;
import bhongy.learn_java.order.models.Order;
import bhongy.learn_java.order.services.BreadService;

// @Slf4j
@Controller
@RequestMapping("/cart")
@SessionAttributes("order")
public class CartController {
  @GetMapping
  public String showCart() {
    return "cart";
  }

  @ModelAttribute(name = "allBreads")
  public List<Bread> allBreads() {
    return BreadService.listAll();
  }

  // session
  @ModelAttribute(name = "order")
  public Order order() {
    return new Order("");
  }
}
