package assignment1.msherwood.models;

public class ArrangeSeating {
    String name;
    Integer seating;

// default consstructor for the arrange seating model
    public ArrangeSeating(String name, Integer seating) {
        this.name = name;
        this.seating = seating;
    }
// this is the getters and setters for arrange seating model
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSeating() {
        return this.seating;
    }

    public void setSeating(Integer seating) {
        this.seating = seating;
    }
 
    
}
