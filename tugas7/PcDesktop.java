package tugas7;

public class PcDesktop extends Komputer{
    public double ukuranMonitor;
    public String jenisPowersupply;
    public boolean adaRGB;

    public PcDesktop() {
    }

    public PcDesktop(String merk, String jenisProcessor, int ram, int rom,
                    double ukuranMonitor, String jenisPowerSupply, boolean adaRGB) {
        super(merk, jenisProcessor, ram, rom);
        this.ukuranMonitor = ukuranMonitor;
        this.jenisPowersupply = jenisPowerSupply;
        this.adaRGB = adaRGB;
    }

    public void hubungkanListrik() {
        System.out.println("Menghubungkan " + merk + " ke sumber daya PSU" + jenisPowersupply);
    }

    // override
    public void nyalakan() {
        System.out.println("PC Desktop " + merk + " menyala! Lampu RGB dan kipas pendingin mulai berputar");
    }

    // override
    public void matikan() {
        System.out.println("PC Desktop " + merk + " mematikan seluruh komponen hardware dan daya PSU");
    }

    // override
    public void tampilkanSpesifikasi() {
        super.tampilkanSpesifikasi();
        System.out.println("Ukuran Monitor  : " + ukuranMonitor + " inci");
        System.out.println("Power Supply    : " + jenisPowersupply);
        System.out.println("Lampu RGB       : " + (adaRGB ? "Ada" : "Tidak ada"));
    }
}
