package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController2 {

    @RequestMapping(value = "/html", method = RequestMethod.GET, produces = "text/html")
    String home_page() {
        return "testhtmlpage.html";
    }

    @RequestMapping(value = "/json", method = RequestMethod.GET, produces = "text/json")
    String json() {
        return "json/tender.json";
    }
}
