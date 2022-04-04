package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //允许这个类接受前端的请求
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "key", required=false, defaultValue="World") String name, Model model){
        model.addAttribute("key", name);//将key和name映射
        return "hello";//指向hello.html
    }
}
