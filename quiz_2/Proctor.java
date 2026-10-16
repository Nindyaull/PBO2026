package quiz_2;

public class Proctor extends Teacher{
    private String roomNo;

    public Proctor(String userId, String name, String nip, String roomNo) {
        super(userId, name, nip);
        this.roomNo = roomNo;
    }

    public void supervise() {
        System.out.println("Pengawas " + name + " mengawasi di ruangan " + roomNo);
    }

    public void supervise(int extraTime) {
        System.out.println("Pengawas " + name + " mengawasi di ruangan " + roomNo + " dengan tambahan waktu " + extraTime + " menit.");
    }

    public void reportIncident(int desc) {
        System.out.println("Laporan insiden (ID " + desc + ") di Ruang " + roomNo);
    }

    public void reportIncident(String desc, int severity) {
        System.out.println("Laporan insiden (Level " + severity + ") di Ruang " + roomNo + ": " + desc);
    }
}
