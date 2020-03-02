package library.Controllers;

import library.Entity.Book;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping("/get")
    Book getBook(){
        return new Book();
    }

    @GetMapping(value = {"/", "/getAll"})
    String getAllBooks(){
        return "getAll";
    }

    @PostMapping("/modify")
    String modifyBook(){
        return "mod";
    }

    @PutMapping("/upload")
    String uploadBook(){
        return "ul";
    }

    @DeleteMapping("/delete")
    String deleteBook(){
        return "del";
    }


}
