package assignment1.msherwood.models;

public class Menu {
    String mains;
    String appetizers;
    String desserts;

// default constructor for menu model
    public Menu(String mains, String appetizers, String desserts) {
        this.mains = mains;
        this.appetizers = appetizers;
        this.desserts = desserts;
    }

// getters and setters for the model
    public String getMains() {
        return this.mains;
    }

    public void setMains(String mains) {
        this.mains = mains;
    }

    public String getAppetizers() {
        return this.appetizers;
    }

    public void setAppetizers(String appetizers) {
        this.appetizers = appetizers;
    }

    public String getDesserts() {
        return this.desserts;
    }

    public void setDesserts(String desserts) {
        this.desserts = desserts;
    }

    
}
