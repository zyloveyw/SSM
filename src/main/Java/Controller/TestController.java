package Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Test")
public class TestController {
    @GetMapping()
    public  String TestString(){
        return  "Hello World!";
    }
}
