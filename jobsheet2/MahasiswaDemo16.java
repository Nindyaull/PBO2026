package jobsheet2;

public class MahasiswaDemo16 {
    public static void main(String[] args) {
        Mahasiswa16 m1 = new Mahasiswa16();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A\n";

        Mahasiswa16 m2 = new Mahasiswa16();
        m2.nim = "012345";
        m2.nama = "Septya Andhita";
        m2.alamat = "Nganjuk, Jawa Timur";
        m2.kelas = "2F\n";

        Mahasiswa16 m3 = new Mahasiswa16();
        m3.nim = "987654";
        m3.nama = "Nindya Aulia";
        m3.alamat = "Kediri, Jawa Timur";
        m3.kelas = "2F\n";

        m1.displayBiodata();
        m2.displayBiodata();
        m3.displayBiodata();
    }
}
