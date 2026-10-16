package quiz_2;

public class Exam extends Person {
    private String examCode;
    private int durationMinutes;

    public Exam(String userId, String name, String examCode, int durationMinutes) {
        super(userId, name);
        this.examCode = examCode;
        this.durationMinutes = durationMinutes;
    }

    public void startExam() {
        System.out.println("Ujian " + name + " (Kode: " + examCode + ") dimulai selama " + durationMinutes + " menit.");
    }
}
