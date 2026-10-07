package jobsheet6;

public class Dosen extends Pegawai {
    public String nidn;

    // public Dosen() {
    //     System.out.println("Objek dari class Dosen dibuat");
    // }

    public Dosen(String nip, String nama, double gaji, String nidn) {
        super(nip, nama, gaji);
        this.nidn = nidn;
    }

    public String getInfo() {
        String info = "";
        info += "NIP        : " + nip + "\n";
        info += "Nama       : " + nama + "\n";
        info += "Gaji       : " + gaji + "\n";
        return info;
    }
}
