package quiz_2;

public class Teacher extends Person{
    protected String nip;

    public Teacher(String userId, String name, String nip) {
        super(userId, name);
        this.nip = nip;
    }

    public String getInfo() {
        return "NIP Guru : " + nip + " | Nama : " + name;
    }

    public String getDashboard() {
        return "Menampilkan dashboard khusus guru (manajemen soal & nilai)";
    }

    public void createExam() {
        System.out.println("Guru " + name + " membuat soal ujian baru.");
    }
}
