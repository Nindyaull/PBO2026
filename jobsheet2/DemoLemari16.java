package jobsheet2;

public class DemoLemari16 {
    public static void main(String[] args) {
        Lemari16 lem1 = new Lemari16();
        lem1.jenisBahan = "Kayu Jati";
        lem1.volume = 100.0f;
        lem1.berat = 40.5f;
        lem1.ukuran = "Besar";
        lem1.warna = "Coklat muda";
        System.out.println();

        lem1.membukaLemari(true);
        lem1.menyimpanPakaian();
        lem1.menutupLemari(true);
        lem1.info();
        System.out.println();

        Lemari16 lem2 = new Lemari16();
        lem2.jenisBahan = "Kayu Mahoni";
        lem2.volume = 150.5f;
        lem2.berat = 50.3f;
        lem2.ukuran = "Sedang";
        lem2.warna = "Hitam";
        System.out.println();

        lem2.membukaLemari(false);
        lem2.menyimpanPakaian();
        lem2.menutupLemari(false);
        lem2.info();
        System.out.println();
    }
}
