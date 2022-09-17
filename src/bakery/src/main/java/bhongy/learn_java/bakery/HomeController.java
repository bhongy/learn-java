package bhongy.learn_java.bakery;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // identify this class as a Controller for component scanning
public class HomeController {

  @GetMapping("/")
  public String home() {
    return "home";
  }
}
