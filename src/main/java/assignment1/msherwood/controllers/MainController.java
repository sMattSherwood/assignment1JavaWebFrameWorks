package assignment1.msherwood.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

//  links that will appear on index
    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public String getMenu()
    {
        return "menu";
    }

    @RequestMapping(value = "/arrangeSeating", method = RequestMethod.GET)
    public String getArrangeSeating()
    {
        return "arrangeSeating";
    }

    @RequestMapping("/seatingOrderPrint")
    public String getAeatingOrderPrint()
    {
        return "seatingOrderPrint";
    } 

}
