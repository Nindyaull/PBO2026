package jobsheet7;

class Manusia {
    public void berfanas() {
        System.out.println("Manusia sedang bernafas.");
    }
    public void makan() {
        System.out.println("Manusia sedang makan.");
    }
}

class Dosen extends Manusia {
    // override
    public void makan() {
        System.out.println("Dosen sedang makan di kantin kampus.");
    }
    public void lembur() {
        System.out.println("Dosen sedang lembur menyiapkan materi.");
    }
}

class Mahasiswa extends Manusia {
    // override
    public void makan() {
        System.out.println("Mahasiswa sedang makan indomie di kosnya.");
    }
    public void tidur() {
        System.out.println("Mahasiswa sedang tidur karena kelelahan habis ngerjain jobsheet.");
    }
}

public class UtamaManusia {
    public static void main(String[] args) {
        Manusia m1 = new Manusia();
        // Dynamic Method Dispatch
        Manusia m2 = new Dosen();
        Manusia m3 = new Mahasiswa();

        m1.makan();
        m2.makan();
        m3.makan();
    }
}
