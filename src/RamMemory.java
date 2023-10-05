public class RamMemory {
    public String brand;
    public Double price;
    public String memoryType;
    public String memoryFrequency;
    public String storage;
    public String memoryFormat;


    public String getFullName() {
        return brand + " " + price + " " + memoryType + " " + memoryFrequency + " " + storage + " " + memoryFormat;
    }

    public String getBrand() {
        return brand;
    }

    public Double getPrice() {
        return price;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public String getMemoryFrequency() {
        return memoryFrequency;
    }

    public String getStorage() {
        return storage;
    }

    public String getMemoryFormat() {
        return memoryFormat;
    }
}
