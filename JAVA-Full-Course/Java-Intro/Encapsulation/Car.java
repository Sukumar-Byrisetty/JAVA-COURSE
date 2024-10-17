package Encapsulation;

public class Car {
    
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

// in the above we have private string variables we can't access from anothe class file. 
// so we create getters and setters below car constructer to access the private variables.
// using getters we will make private file as public we will access from anywhere
// using setters we will make priavte file to public and will set the values manually for those.

