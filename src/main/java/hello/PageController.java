package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "text/html")
    String getHomePage() {
        return "index.html";
    }
}
