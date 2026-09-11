package jobsheet2;

public class Barang16 {
    public String kode;
    public String nama;
    public double hargaKotor;
    public double diskon;

    public double getHargaBesih() {
        return hargaKotor - diskon * hargaKotor;
    }

    public void displayInfo() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Harga Kotor   : " + hargaKotor);
        System.out.println("Diskon        : " + diskon);
        System.out.println("Harga Bersih  : " + getHargaBesih());
    }
}
