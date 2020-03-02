package a112_rest_spring.RestController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/servlet")
public class ServletController {

    @GetMapping("/home")
    String methodv1(@RequestHeader(value = "Accept-Language", required = false) String input,
                @RequestHeader(value = "this-is-own-header") String input2){
        return "hello " + input;
    }

    @GetMapping("/servlet")
    String methodv2(HttpServletRequest request){
        System.out.println(request.getHeader("this-is-own-header"));
        return "done";
    }
    @GetMapping("/response")
    String methodv3(HttpServletResponse response){
        response.addHeader("this is reponse header", "value1");
        return "done";
    }

    @GetMapping("/entity")
    ResponseEntity returnMeRent(){
        System.out.println("entity worked");
        return ResponseEntity.status(403).body(1000);
    }




}
