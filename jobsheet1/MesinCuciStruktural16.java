package jobsheet1;

public class MesinCuciStruktural16 {
    public static void main(String[] args) {
        String merk[] = {"LG", "Samsung", "Electrolux", "Sharp", "Toshiba", 
                        "Panasonic", "Sanken", "Hitachi", "Polytron", "Aqua Japan"};
        int harga[] = {3500000, 3000000, 2500000, 3000000, 4000000, 4500000, 3500000, 3000000, 2500000, 2000000};
        String ukuran[] = {"Sedang", "Kecil", "Besar", "Sedang", "Besar", "Kecil", "Kecil", "Besar", "Sedang", "Kecil"};

        boolean statusMenyala[] = new boolean[10];

        for (int i=0; i<10; i++) {
            statusMenyala[i] = menyalakanMesin(statusMenyala[i]);
        }

        for (int i=0; i<10; i++) {
            System.out.println("Merk mesin cuci : " + merk[i]);
            System.out.println("Harga : Rp " + harga[i]);
            System.out.println("Ukuran : " + ukuran[i]);

            membilasBaju(merk[i], statusMenyala[i]);
            System.out.println();
        }
    }

    public static boolean menyalakanMesin(boolean statusSaatIni) {
        statusSaatIni = true;
        return statusSaatIni;
    }

    public static void membilasBaju(String merkMesin, boolean isMenyala) {
        if(isMenyala) {
            System.out.println("Proses: Mesin Cuci " + merkMesin + " sedang membilas baju.");
        } else {
            System.out.println("Proses: Mesin Cuci " + merkMesin + " tidak bisa membilas, mesin belum dinyalakan");
        }
    }
}
