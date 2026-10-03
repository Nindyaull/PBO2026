package inheritance;

public class Laptop extends Komputer {
    public int kapasitasBaterai;
    public double berat;
    public boolean touchScreen;

    public Laptop(String merk, String jenisProcessor, int ram, int rom, int kapasitasBaterai, double berat, boolean touchScreen) {
        super(merk, jenisProcessor, ram, rom);
        this.kapasitasBaterai = kapasitasBaterai;
        this.berat = berat;
        this.touchScreen = touchScreen;
    }

    public void isiBaterai() {
        System.out.println("Mengisi daya baterai " + merk + " (Kapasitas: " + kapasitasBaterai + " mAH).");
    }

    public void modeHematDaya() {
        System.out.println(merk + " masuk ke mode hemat daya untuk menghemat baterai.");
    }
    
}
