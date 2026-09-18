package serviceHP;

import java.time.LocalDate;

public class ServiceHPDemo {
    public static void main(String[] args) {
        Teknisi teknisi1 = new Teknisi("T001", "Nindya Aulia", "Hardware & Layar");
        Teknisi teknisi2 = new Teknisi("T002", "Rachmah Nur", "Software");

        Pelanggan pelanggan1 = new Pelanggan("P001", "Septya Andhita", "08123456789");
        pelanggan1.tambahService(LocalDate.of(2026, 9, 18),
        "Iphone 15 promax", "Layar retak dan LCD bergaris", teknisi1);
        pelanggan1.tambahService(LocalDate.of(2026, 9, 18),
        "Poco X7 Pro", "Mati total", teknisi2);

        Pelanggan pelanggan2 = new Pelanggan("P002", "Siti Aminah", "08987654321");

        System.out.println("=== Data Pelanggan 1 ===");
        System.out.println(pelanggan1.getInfo());
        System.out.println("=== Data Pelanggan 2 ===");
        System.out.println(pelanggan2.getInfo());
    }
}
