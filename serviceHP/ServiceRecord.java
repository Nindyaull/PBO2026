package serviceHP;

import java.time.LocalDate;

public class ServiceRecord {
    private LocalDate tanggal;
    private String tipeHp;
    private String kerusakan;
    private String status;
    private  Teknisi teknisi;

    public ServiceRecord(LocalDate tanggal, String tipeHP, String kerusakan, Teknisi teknisi) {
        this.tanggal = tanggal;
        this.tipeHp = tipeHP;
        this.kerusakan = kerusakan;
        this.teknisi = teknisi;
        this.status = "Diproses";
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public String getTipeHP() {
        return tipeHp;
    }

    public void setTipeHP(String tipeHp) {
        this.tipeHp = tipeHp;
    }

    public String getKerusakan() {
        return kerusakan;
    }

    public void setKerusakan(String kerusakan) {
        this.kerusakan = kerusakan;
    }

    public String getStatus() {
        return  status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Teknisi getTeknisi() {
        return teknisi;
    } 

    public void setTeknisi(Teknisi teknisi) {
        this.teknisi = teknisi;
    }

    public String getInfo() {
        String info = "Tanggal: " + tanggal + ", HP: " + tipeHp + ", Rusak: " + kerusakan + ", Status: " + status;
        if (teknisi != null) {
            info += "\n Ditangani oleh: " +teknisi.getInfo();
        }
        return info;
    }
}
