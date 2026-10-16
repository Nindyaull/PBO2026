package quiz_2;

public class demo {
    public static void main(String[] args) {
        // Overriding
        Teacher guru = new Teacher("T001", "Rachmah Nur", "19850110");
        System.out.println(guru.getInfo());
        System.out.println(guru.getDashboard());

        System.out.println("------------------------------------------------------------------------");

        // Menguji Exam
        Exam ujian = new Exam("E001", "Ujian Matematika", "Math2026", 90);
        ujian.startExam();

        System.out.println("------------------------------------------------------------------------");

        // Overloading di Proctor
        Proctor pengawas = new Proctor("P001", "Nindya Aulia", "19900512", "Kelas MIPA 2");
        pengawas.login();
        
        pengawas.supervise();
        pengawas.supervise(15);

        pengawas.reportIncident(404);
        pengawas.reportIncident("Siswa mencoba membuka tab lain.", 2);
    }
}
