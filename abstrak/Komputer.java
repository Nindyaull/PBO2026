package abstrak;

public abstract class Komputer {
    public String merk;
    public String jenisProcessor;
    public int ram; // dalam gb
    public int rom; // dalam gb

    public Komputer() {
    }

    public Komputer (String merk, String jenisProcessor, int ram, int rom) {
        this.merk = merk;
        this.jenisProcessor = jenisProcessor;
        this.ram = ram;
        this.rom = rom;
    }

    public abstract void nyalakan();
    public abstract void matikan();

    public void tampilkanSpesifikasi() {
        System.out.println("Merk        : " + merk);
        System.out.println("Processor   : " + jenisProcessor);
        System.out.println("RAM         : " + ram);
        System.out.println("ROM         : " + rom);
    }
}
