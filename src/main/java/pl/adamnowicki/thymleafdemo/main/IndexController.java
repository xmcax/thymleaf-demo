package pl.adamnowicki.thymleafdemo.main;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

  @RequestMapping("/")
  public String getIndex(final Map<String, Object> model) {
    model.put("title", "Click me");
    return "index";
  }
}
