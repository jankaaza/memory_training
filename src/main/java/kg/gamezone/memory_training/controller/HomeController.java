package kg.gamezone.memory_training.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public  String  getHome(){
        return "Home.html";
    }
}
