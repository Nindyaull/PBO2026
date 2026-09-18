package serviceHP;

public class Teknisi {
    private String idTeknisi;
    private String nama;
    private String spesialisasi;

    public Teknisi(String idTeknisi, String nama, String spesialisasi) {
        this.idTeknisi = idTeknisi;
        this.nama = nama;
        this.spesialisasi = spesialisasi;
    }

    public String getIdTeknisi() {
        return idTeknisi;
    }

    public void setIdTeknisi(String idTeknisi) {
        this.idTeknisi = idTeknisi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    public String getInfo() {
        return "Teknisi: " + nama + " (" + idTeknisi + "), Spesialisasi: " + spesialisasi; 
    }
}
