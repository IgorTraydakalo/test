package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/json")
public class ProzorroController {

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "text/json")
    String tender() {
        return "json/tender.json";
    }

    @RequestMapping(value = "/documents", method = RequestMethod.GET, produces = "text/json")
    String document() {
        return "json/tender.json";
    }
}
