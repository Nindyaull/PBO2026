package inheritance;

public class demo {
    public static void main(String[] args) {
        // Objek Laptop
        System.out.println("=== LAPTOP NINDYA ===");
        Laptop nindya = new Laptop("Axioo", "Intel Core i5", 8, 256, 3000, 1, false);
        nindya.tampilkanSpesifikasi();
        nindya.isiBaterai();
        nindya.modeHematDaya();
        System.out.println();
        Laptop rima = new Laptop("Lenovo", "Intel Core i5", 8, 256, 3500, 1, false);
        rima.tampilkanSpesifikasi();
        rima.isiBaterai();
        System.out.println();

        // Modifikasi agar nilai di parameter berubah
        System.out.println("=== UPGRAGE RAM DAN ROM ===");
        nindya.ram = 24;
        nindya.rom = 512;
        nindya.tampilkanSpesifikasi();


        System.out.println("\n-----------------------------------------------\n");

        System.out.println("=== PC DESKTOP NINDYA ===");
        PcDesktop pcNindya = new PcDesktop("Custom Gaming PC", "AMD Ryzen 9", 64, 2000, 32.0, "850W Platinum", true);
        pcNindya.tampilkanSpesifikasi();
        pcNindya.tampilPcDesktop();

        // nindya.merk = "lenovo LOQ 15";
        // nindya.jenisProcessor = "Intel Core i7";
        // nindya.ram = 16;
        // nindya.rom = 512;
        // nindya.kapasitasBaterai = 5200;
        // nindya.berat = 2.38;
        // nindya.touchScreen = false;

        // System.out.println("Berat       : " + nindya.berat + " kg");
        // System.out.println("Touch Screen? " + (nindya.touchScreen ? "Ya" : "Tidak"));
        // nindya.nyalakan();
        // nindya.isiBaterai();
        // nindya.modeHematDaya();
        

        // Objek PC Desktop
        // pcNindya.merk = "Custom Gaming PC";
        // pcNindya.jenisProcessor = "AMD Ryzen 9";
        // pcNindya.ram = 64;
        // pcNindya.rom = 2000;
        // pcNindya.ukuranMonitor = 32.0;
        // pcNindya.jenisPowerSupply = "850W Platinum";
        // pcNindya.adaRGB = true;
        // pcNindya.hubungkanListrik();
        // pcNindya.matikan();

    }
}
