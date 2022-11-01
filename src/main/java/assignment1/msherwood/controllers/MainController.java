package assignment1.msherwood.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import assignment1.msherwood.models.ArrangeSeating;
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
        @RequestParam(required = true, defaultValue = "0") String mains,
        @RequestParam(required = true, defaultValue = "0") String appetizers,
        @RequestParam(required = true, defaultValue = "0") String desserts,
        Model model
    )
    {
        Menu newMenu = new Menu(mains, appetizers, desserts);
        menuItems.add(newMenu);
        model.addAttribute("menu", newMenu);
        return "menuReciept";
    }

    ArrayList<ArrangeSeating> reservationItems = new ArrayList<>();
    @RequestMapping(value = "/arrangeSeating", method = RequestMethod.GET)
    public String getArrangeSeating()
    {
        return "arrangeSeating";
    }
    @RequestMapping(value = "/arrangeSeating", method = RequestMethod.POST)
    public String addReservation(
        @RequestParam String name,
        @RequestParam Integer seating,
        Model model
    )
    {
        ArrangeSeating newArrangeSeating = new ArrangeSeating(name, seating);
        reservationItems.add(newArrangeSeating);
        model.addAttribute("seatingItems", newArrangeSeating);
        return "reservation";
    }
}
