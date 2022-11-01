package assignment1.msherwood.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import assignment1.msherwood.models.ArrangeSeating;
import assignment1.msherwood.models.Menu;
import assignment1.msherwood.services.MenuService;
import assignment1.msherwood.services.SeatingService;

@Controller
public class MainController {

    
// seating injection
// this will allow the seating service be displayed 
SeatingService seatingService;

@Autowired
public MainController(SeatingService seatingService)
{
    this.seatingService = seatingService;
}

@RequestMapping(value = "/arrangeSeating", method = RequestMethod.POST)
public String displayReservation(@RequestParam String name,
@RequestParam Integer seating, Model model)
{
    ArrangeSeating arrangeSeating = new ArrangeSeating(name, seating);
    String message = seatingService.displayReservation(arrangeSeating);
    model.addAttribute("reservationOrder", message);
    return "reservationsOrders";
}
// end of seating service injection

// this is the menu service 
@RequestMapping(value = "menu", method = RequestMethod.POST)
public String displayMenu(@RequestParam String mains,
@RequestParam String appetizers, @RequestParam String desserString,
Model model)
{
    MenuService menuService = new MenuService();
    Menu newMenu = new Menu(mains, appetizers, desserString);
    String order = menuService.displayMenu(newMenu);
    model.addAttribute("order", order);
    return "menuOrder";
}

//  links that will appear on index
    ArrayList<Menu> menuItems = new ArrayList<>();
    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public String getMenu()
    {
        return "menu";
    }
    // this will allow the data from the form to display on menu reciept
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

    ArrayList<ArrangeSeating> reservationItems = new ArrayList<>();
    @RequestMapping(value = "/arrangeSeating", method = RequestMethod.GET)
    public String getArrangeSeating()
    {
        return "arrangeSeating";
    }
    // this will use the data gathered by the user to display on reservation
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
