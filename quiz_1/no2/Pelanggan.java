package quiz_1.no2;

import java.util.ArrayList;

public class Pelanggan {
    private String nama;
    private String nomorTelepon;
    private ArrayList<Kendaraan> daftarKendaraan;

    public Pelanggan(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
        this.daftarKendaraan = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public ArrayList<Kendaraan> getDaftarKendaraan() {
        return daftarKendaraan;
    }

    // untuk menambahkan kendaraan, krn 1 pelanggan bisa banyak kendaraan
    public void tambahKendaraan(Kendaraan kendaraan) {
        this.daftarKendaraan.add(kendaraan);
        kendaraan.setPemilik(this);
    }

    public String getInfo() {
        return "Nama Pelanggan  : " + nama + "\nNo. Telepon     : " + nomorTelepon;
    }
}
