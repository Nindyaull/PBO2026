package jobsheet3;

public class LemariDemo {
    public static void main(String[] args) {
        Lemari lemariPakaian = new Lemari();
        lemariPakaian.setJenisBahan("Kayu Jati");
        lemariPakaian.setWarna("Coklat Tua");

        System.out.println("--- Simulasi ---");
        lemariPakaian.membukaLemari(true);
        lemariPakaian.menyimpanPakaian();
        String statusPakaian = lemariPakaian.ambilPakaian();
        System.out.println(statusPakaian);

        lemariPakaian.menutupLemari(false);
        System.out.println();
        lemariPakaian.info();
    }
}
