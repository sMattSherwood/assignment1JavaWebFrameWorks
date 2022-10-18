package assignment1.msherwood.models;

public class ArrangeSeating {
    String Name;
    String Seating;

    public ArrangeSeating(String Name, String Seating) {
        this.Name = Name;
        this.Seating = Seating;
    }


    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSeating() {
        return this.Seating;
    }

    public void setSeating(String Seating) {
        this.Seating = Seating;
    }

    
}
