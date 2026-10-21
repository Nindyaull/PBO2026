package abstrak;

public class PcDesktop extends Komputer {
    public double ukuranMonitor; //inci
    public String jenisPowerSupply;
    public boolean adaRGB;

    public PcDesktop() {
        super();
    }
    
    public PcDesktop(String merk, String jenisProcessor, int ram, int rom, double ukuranMonitor, String jenisPowerSupply, boolean adaRGB) {
        super(merk, jenisProcessor, ram, rom);
        this.ukuranMonitor = ukuranMonitor;
        this.jenisPowerSupply = jenisPowerSupply;
        this.adaRGB = adaRGB;
    }

    public void nyalakan() {
        System.out.println(merk + " sedang dinyalakan");
    }
    
    public void matikan() {
        System.out.println(merk + " sedang dimatikan");
    }

    public void hubungkanListrik() {
        System.out.println("Menghubungkan " + merk + " ke sumber daya PSU " + merk + ".");
    }

    public void tampilPcDesktop() {
        System.out.println("Ukuran Monitor      : " + ukuranMonitor + " inci");
        System.out.println("Power Supply        : " + jenisPowerSupply);
        System.out.println("Ada lampu RGB? " + (adaRGB ? "Ada" : "Tidak ada"));
    }
}
