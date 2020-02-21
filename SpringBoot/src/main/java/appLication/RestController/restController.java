package appLication.RestController;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/home")
public class restController {

    @GetMapping("/string")
    String printString() {
        System.out.println("get mapping worked");
        return "Hello world !";
    }

    @GetMapping("/list")
    List<String> printList() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Jack");
        stringList.add("John");
        stringList.add("Mike");
        return stringList;
    }

    @GetMapping("/map")
    Map<Integer, String> printMap() {
        Map<Integer, String> newMap = new HashMap<>();
        newMap.put(1, "Jack");
        newMap.put(2, "John");
        newMap.put(3, "Mike");
        return newMap;
    }

    @PostMapping("/poststring")
    String printStringv2() {
        System.out.println("post mapping worked");
        return "Hello world !";
    }

    @PutMapping("/putstring")
    String printStringv3() {
        System.out.println("put mapping worked");
        return "Hello world !";
    }

    @DeleteMapping("/deletestring")
    String printStringv4() {
        System.out.println("delete mapping worked");
        return "Hello world !";
    }



}
