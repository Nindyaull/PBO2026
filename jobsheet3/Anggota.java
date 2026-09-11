package jobsheet3;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    // constructor untuk menginisialisasi nilai awal saat objek dibuat
    public Anggota(String nomorKTP, String nama, int limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // getter unutk limit pinjaman
    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    // getter jumlah pinjaman
    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    // method untuk meminjam uang dengan validasi limit
    public void pinjam(int nominal) {
        if (this.jumlahPinjaman + nominal > this.limitPinjaman) {
            System.out.println("Maaf, jumlah ponjaman melebihi limit");
        } else {
            this.jumlahPinjaman += nominal;
        }
    }

    // method untuk mengangsur pinjaman
    public void angsur(int nominal) {
        if (nominal < (this.jumlahPinjaman * 0.1)) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else {
            this.jumlahPinjaman -= nominal;
        }
    }
}
