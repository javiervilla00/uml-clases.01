public class MotherBoard {
    public String brand;
    public Double price;
    public String socket;
    public String chipset;
    public String conectivity;
    public String formFactor;

    public String getFullName() {
        return brand + " " + price + " " + socket + " " + chipset + " " + conectivity + " " + formFactor;
    }

    public String getBrand() {
        return brand;
    }

    public Double getPrice() {
        return price;
    }

    public String getSocket() {
        return socket;
    }

    public String getChipset() {
        return chipset;
    }

    public String getConectivity() {
        return conectivity;
    }

    public String getFormFactor() {
        return formFactor;
    }
}
