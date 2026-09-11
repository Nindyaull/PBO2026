package jobsheet2;

public class DemoPersegi16 {
    public static void main(String[] args) {
        PersegiPanjang16 pp1 = new PersegiPanjang16();
        pp1.panjang = 15;
        pp1.lebar = 3;

        System.out.println("\n== Hasil Perhitungan Persegi Panjang ==");
        pp1.displayInfo();
        System.out.println();
    }
}
