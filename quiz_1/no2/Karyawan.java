package quiz_1.no2;

public class Karyawan {
    private String idKaryawan;
    private String nama;
    private String posisi;

    public Karyawan(String idKaryawan, String nama, String posisi) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.posisi = posisi;
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public String getInfo() {
        return nama + " (" + posisi + " - ID: " + idKaryawan + ")";
    }
}
