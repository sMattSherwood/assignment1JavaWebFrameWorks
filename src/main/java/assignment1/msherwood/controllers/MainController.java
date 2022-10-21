package assignment1.msherwood.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import assignment1.msherwood.models.Menu;

@Controller
public class MainController {

    
//  links that will appear on index
ArrayList<Menu> menuItems = new ArrayList<>();
    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public String getMenu()
    {
        return "menu";
    }


    @RequestMapping(value = "/menu", method = RequestMethod.POST)
    public String postMenu(
        @RequestParam String mains,
        @RequestParam String appetizers,
        @RequestParam String desserts,
        Model model
    )
    {
        Menu newMenu = new Menu(mains, appetizers, desserts);
        menuItems.add(newMenu);
        model.addAttribute("menu", newMenu);
        return "menuReciept";
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
