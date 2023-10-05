public class Tower {
    public String brand;
    public Double price;
    public String model;
    public String colour;

    public String getFullName() {
        return brand + " " + price + " " + model + " " + colour;
    }

    public String getBrand() {
        return brand;
    }

    public Double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {return colour;}
}
