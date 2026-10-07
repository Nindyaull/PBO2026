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

        // Modifikasi agar nilai di parameter berubah
        System.out.println("=== UPGRAGE RAM DAN ROM ===");
        nindya.ram = 24;
        nindya.rom = 512;
        nindya.kapasitasBaterai = 5000;
        nindya.tampilkanSpesifikasi();


        System.out.println("\n-----------------------------------------------\n");

        System.out.println("=== PC DESKTOP NINDYA ===");
        PcDesktop pcNindya = new PcDesktop("Custom Gaming PC", "AMD Ryzen 9", 64, 2000, 32.0, "850W Platinum", true);
        pcNindya.tampilkanSpesifikasi();
        pcNindya.tampilPcDesktop();
    }
}
