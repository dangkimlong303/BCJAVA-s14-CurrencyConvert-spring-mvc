package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CurrencyController {
    @GetMapping("/convert")
    public String convert(){
        return "currency/index";
    }
@GetMapping("/asd")
public ModelAndView dic(){
        ModelAndView modelAndView = new ModelAndView("aaa");
        modelAndView.addObject("id","111222");
        return modelAndView;
}
    @PostMapping("/convert")
    public String convert(@RequestParam String rate, @RequestParam String usd , Model model){
        double result = Double.parseDouble(rate) * Double.parseDouble(usd);
        model.addAttribute("res", result);
        return "currency/index";
    }


}
