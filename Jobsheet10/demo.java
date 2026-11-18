package Jobsheet10;

public class demo {
    public static void main(String[] args) {
        // Instansiasi concrete class
        Kipas kipas = new Kipas("Dinding", 200000, "Putih", "Maspion");
        TV tv = new TV("LED", 15, 3500000, "Hitam", "LG");
        SmartFridge kulkasPintar = new SmartFridge(7, 2, 8500000, "Putih", "Samsung");
        
        // Memanggil interface method
        tv.naikkanVolume(10);
        kulkasPintar.turunkanVolume(5);

        // Menampilkan getInfo()
        System.out.println("--- INFO KIPAS ---");
        System.out.println(kipas.getInfo());
        
        System.out.println("\n--- INFO TV ---");
        System.out.println(tv.getInfo());
        
        System.out.println("\n--- INFO SMART FRIDGE ---");
        System.out.println(kulkasPintar.getInfo());
    }
}
