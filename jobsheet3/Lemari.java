package jobsheet3;

public class Lemari {
    private String jenisBahan;
    private float volume;
    private float berat;
    private String ukuran;
    private String warna;
    private boolean isStatusBuka;
    private boolean isStatusTutup;

    public void setJenisBahan(String jenisBahan) {
        this.jenisBahan = jenisBahan;
    }

    public String getJenisBahan() {
        return jenisBahan;
    }

    public float getVolume() {
        return volume;
    }

    public float getBerat() {
        return berat;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public void membukaLemari(boolean statusBuka) {
        this.isStatusBuka = statusBuka;
        if (statusBuka) {
            this.isStatusTutup = false;
        }
    }

    public void menyimpanPakaian() {
        System.out.println("Pakaian berhasil disimpan ke dalam lemari");
    }

    public String ambilPakaian() {
        return "Pakaian telah diambil";
    }

    public void menutupLemari(boolean statusTutup) {
        this.isStatusTutup = isStatusTutup;
        if (statusTutup) {
            this.isStatusBuka = false;
        }
    }

    public void info() {
        System.out.println("--- INFO LEMARI ---");
        System.out.println("Jenis Bahan  : " + jenisBahan);
        System.out.println("Volume       : " + volume);
        System.out.println("Berat        : " + berat);
        System.out.println("Ukuran       : " + ukuran);
        System.out.println("Warna        : " + warna);
        System.out.println("Status Buka  : " + isStatusBuka);
        System.out.println("Status Tutup : " + isStatusTutup);
    }
}
