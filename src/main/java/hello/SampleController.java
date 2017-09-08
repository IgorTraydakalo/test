package hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping(value = "/test/", method = RequestMethod.GET, produces = "text/json")
    String home_page() {
        return "json/tender.json";
    }

    public static void main(String[] args) throws Exception {
        Class[] primarySources = {SampleController.class, ProzorroController.class, PageController.class};
        SpringApplication.run(primarySources, args);
    }
}