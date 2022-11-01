package assignment1.msherwood.services;

import assignment1.msherwood.models.ArrangeSeating;

public class seatingService {
    
    public String displayReservation(ArrangeSeating reservation)
    {
        return "Person who reserved this table is " + reservation.getName() + " Number of seats at table are " +
            reservation.getSeating();

    }
    
}
