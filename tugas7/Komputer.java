package tugas7;

public class Komputer {
    public String merk;
    public String jenisProcessor;
    public int ram;
    public int rom;
    public final String kategori = "Perangkat Komputasi";

    public Komputer() {
    }

    public Komputer(String merk, String jenisProcessor, int ram, int rom) {
        this.merk = merk;
        this.jenisProcessor = jenisProcessor;
        this.ram = ram ;
        this.rom = rom;
    }

    // override
    public void nyalakan() {
        System.out.println(merk + " sedang menyala...");
    }

    // override
    public  void matikan() {
        System.out.println(merk + " Sedang dimatikan...");
    }

    // override 
    public void tampilkanSpesifikasi() {
        System.out.println("Merk        : " + merk);
        System.out.println("Processor   : " + jenisProcessor);
        System.out.println("RAM         : " + ram);
        System.out.println("ROM         : " + rom);
    }

    // overloading 
    public void tampilkanSpesifikasi(String header) {
        System.out.println("=== " + header + " ===");
        tampilkanSpesifikasi();
    }

    public final void infoKategori() {
        System.out.println("Kategori Perangkat : " + kategori);
    }
}
