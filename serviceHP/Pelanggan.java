package serviceHP;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String noTelepon;
    private ArrayList<ServiceRecord> riwayatService;

    public Pelanggan(String idPelanggan, String nama, String noTelepon) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.noTelepon = noTelepon;
        this.riwayatService = new ArrayList<>();
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelangga(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public void tambahService(LocalDate tanggal, String tipeHp, String kerusakan, Teknisi teknisi) {
        ServiceRecord serviceBaru = new ServiceRecord(tanggal, tipeHp, kerusakan, teknisi);
        riwayatService.add(serviceBaru);
    }

    public String getInfo() {
        String info = "ID Pelanggan : " + idPelanggan + "\n";
        info += "Nama         : " + nama + "\n";
        info += "No Telepon   : " + noTelepon + "\n";

        if (!riwayatService.isEmpty()) {
            info += "Riwayat Service :\n";
            for (ServiceRecord record : riwayatService) {
                info += "- " + record.getInfo() + "\n";
        }
        } else {
            info += "Belum ada riwayat service.\n";
        }
        return info;
    }
}
