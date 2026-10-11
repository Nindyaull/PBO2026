package tugas7;

public class Laptop extends Komputer{
    public int kapasitasBaterai;
    public double berat;
    public boolean touchScreen;

    public Laptop() {
    }

    public Laptop(String merk, String jenisProcessor, int ram, int rom, 
                int kapasitasBaterai, double berat, boolean touchScreen) {
        super(merk, jenisProcessor, ram, rom);
        this.kapasitasBaterai = kapasitasBaterai;
        this.berat = berat;
        this.touchScreen = touchScreen;
    }

    public void isiBaterai() {
        System.out.println("Mengisi daya baterai " + merk + " (Kapasitas: " + kapasitasBaterai + " mAh).");
    }

    public void modeHematDaya() {
        System.out.println(merk + " masuk ke mode hemat daya.");
    }

    // override
    public void nyalakan() {
        System.out.println("Laptop " + merk + " menyala dengan menekan tombol power.");
    }

    // override
    public void matikan() {
        System.out.println("Laptop " + merk + " memasuki mode shutdown dan menutup sistem daya baterai.");
    }

    // override
    public void tampilkanSpesifikasi() {
        super.tampilkanSpesifikasi();
        System.out.println("Baterai     : " + kapasitasBaterai + " mAh");
        System.out.println("Berat       : " + berat + " kg");
        System.out.println("Touch Screen: " + (touchScreen ? "Ya" : "Tidak"));
    }
}
