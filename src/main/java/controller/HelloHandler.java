package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloHandler {
    @RequestMapping("/index")
    public String index(){
        System.out.println("请求成功");
        return "index";
    }
}
