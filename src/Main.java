public class Main {

    public static void main(String[] args) {
        Procesador procesador = new Procesador();
        procesador.marca = "AMD";
        procesador.modelo = "AM456";
        procesador.precio = 3.4;

        System.out.println("Procesador: " + procesador.getNombreCompleto());

        MotherBoard motherBoard = new MotherBoard();
        motherBoard.brand = "MSI";
        motherBoard.price = 96.99;
        motherBoard.socket = "AM4";
        motherBoard.chipset = "AMD A520";
        motherBoard.conectivity = "USB 3.2";
        motherBoard.formFactor = "MATX";

        System.out.println("Placa base: " + motherBoard.getFullName());

        RamMemory ramMemory = new RamMemory();
        ramMemory.brand = "Corsair";
        ramMemory.price = 121.99;
        ramMemory.memoryType = "DDR5";
        ramMemory.memoryFrequency = "6000Mhz";
        ramMemory.storage = "32Gb";
        ramMemory.memoryFormat = "DIMM";

        System.out.println("Ram: " + ramMemory.getFullName());

        Tower tower = new Tower();
        tower.brand = "Tempest";
        tower.price = 50.99;
        tower.model = "Umbra RGB";
        tower.colour = "negro";

        System.out.println("Torre: " + tower.getFullName());
    }
}
