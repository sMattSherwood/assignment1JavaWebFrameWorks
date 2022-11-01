package assignment1.msherwood.services;

import assignment1.msherwood.models.Menu;

public class MenuService {
    
    public String displayMenu(Menu menuItems)
    {
        return "Entre " + menuItems.getMains() + " Your appetizer is " + menuItems.getAppetizers() + 
            " your dessert is " + menuItems.getDesserts();

    }
    
}
