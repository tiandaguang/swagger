
package com.thfund.app.ifinance.web.conn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

 
@Controller
public class HelloSpringController {
    String message = "Welcome to Spring MVC!";
 
    @RequestMapping(value ="/hello11111111111111", method = RequestMethod.GET)
    public ModelAndView showMessage(@RequestParam(value = "name", required = false, defaultValue = "Spring" ) String name) {
 
        ModelAndView mv = new ModelAndView("hellospring");//指定视图
        mv.addObject("message", message);
        mv.addObject("name", name);
        return mv;
    }
}