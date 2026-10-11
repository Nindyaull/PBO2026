package tugas7;

public class demo {
    public static void main(String[] args) {
        System.out.println("=============== LAPTOP NINDYA ===============");
        Laptop nindya = new  Laptop("Axioo", "Intel Core i5", 8, 256, 3000, 1.2, false);

        // memanggil method overriding pada laptop
        nindya.nyalakan();
        nindya.tampilkanSpesifikasi();
        nindya.matikan();
        System.out.println("---------------------------------------------");
        // method overloading
        nindya.tampilkanSpesifikasi("--- SPESIFIKASI LAPTOP ---");

        System.out.println("\n=============== PC DESKTOP NINDYA ===============");
        PcDesktop pcNindya = new PcDesktop("Custom Gaming PC", "AMD Ryzen 9", 64, 2000, 32.0, "850W Platinum", true);

        // memanggil method overriding pada PcDesktop
        pcNindya.nyalakan();
        pcNindya.tampilkanSpesifikasi();
        pcNindya.matikan();
    }
}
