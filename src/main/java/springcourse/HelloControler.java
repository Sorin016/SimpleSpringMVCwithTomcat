package springcourse;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;


@Controller
public class HelloControler {


    @GetMapping
    public String main() {
        return "index";
    }

    @GetMapping("/hw")
    public String sayHello() {
        return "hw";
    }




}
