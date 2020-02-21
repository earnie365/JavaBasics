package appLication.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home2")
public class anotherRestController {

    @GetMapping("/param")
    String printString(@RequestParam (value = "name") String input) {
        System.out.println("Request worked with input: " + input);
        return "Hello " + input;
    }

    @GetMapping("/defaultparam")
    String printStringv2(@RequestParam (value = "name", defaultValue = "world") String input) {
        System.out.println("Request worked with input: " + input);
        return "Hello " + input;
    }

    @GetMapping("/{input}")
    String printStringv3(@PathVariable String input) {
        System.out.println("Request worked with input: " + input);
        return "Hello " + input;
    }
}
