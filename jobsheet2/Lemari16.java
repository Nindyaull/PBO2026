package jobsheet2;

public class Lemari16 {
    public String jenisBahan;
    public float volume;
    public float berat;
    public String ukuran;
    public String warna;
    public boolean isStatusBuka;
    public boolean isStatusTutup;

    public boolean membukaLemari(boolean statusBuka) {
       isStatusBuka = statusBuka;
       isStatusTutup = !statusBuka;
       return isStatusBuka;
    }

    public void menyimpanPakaian() {
        System.out.println("Menyimpan pakaian ke lemari");
    }

    public String ambilPakaian() {
        return "Mengambil pakaian dari lemari";
    }

    public boolean menutupLemari(boolean statusTutup) {
        isStatusTutup = statusTutup;
        isStatusBuka = !statusTutup;
        return isStatusTutup;
    }

    public void info() {
        System.out.println("Jenis Bahan          : " + jenisBahan);
        System.out.println("Volume               : " + volume);
        System.out.println("berat                : " + berat);
        System.out.println("ukuran               : " + ukuran);
        System.out.println("warna                : " + warna);
        System.out.println("Status Terbuka       : " + isStatusBuka);
        System.out.println("Status Tertutup      : " + isStatusTutup);
    }
}
