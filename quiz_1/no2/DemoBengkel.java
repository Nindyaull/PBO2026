package quiz_1.no2;

public class DemoBengkel {
    public static void main(String[] args) {
        // instansiasi pelanggan
        Pelanggan pelanggan = new Pelanggan("Nindya Aulia", "0881027755651");
        // instansiasi karyawan
        Karyawan mekanik = new Karyawan("K001", "Windah Basudara", "Mekanik Senior");
        // instansiasi layaan
        Layanan gantiOli = new Layanan("Ganti Oli Gardan", 85000);
        Layanan tuneUp = new Layanan("Tune Up Mesin", 150000);
        Layanan servisRem = new Layanan("Servis Rem", 80000);
        Layanan servisRutin = new Layanan("Servis Rutin", 60000);
        // instansiasi kendaraan (2 mobil dan 2 motor)
        Kendaraan mobil1 = new Kendaraan("Ag 1234 AB", "Toyota", "Avanza", "Mobil");
        Kendaraan mobil2 = new Kendaraan("N 1234 CA", "Honda", "Civic", "Mobil");
        Kendaraan motor1 = new Kendaraan("AE 1324 BA", "Yamaha", "Yamaha X-Ride 125", "Motor");
        Kendaraan motor2 = new Kendaraan("AA 1524 ZA", "Honda", "Vario 150", "Motor");

        // untuk menghubungkan kendaraan ke pelanggan
        pelanggan.tambahKendaraan(mobil1);
        pelanggan.tambahKendaraan(mobil2);
        pelanggan.tambahKendaraan(motor1);
        pelanggan.tambahKendaraan(motor2);

        // array layanan pilih untuk masing2 kendaraan
        Layanan[] layananDipilih = {gantiOli, tuneUp, servisRem, servisRutin};

        // menampilkan info
        System.out.println("===========================================================");
        System.out.println("      SISTEM BENGKEL MAJU MUNDUR - INFORMASI LAYANAN       ");
        System.out.println("===========================================================");
        System.out.println(pelanggan.getInfo());
        System.out.println("Mekanik Bertugas: " + mekanik.getInfo());
        System.out.println("-----------------------------------------------------------");
        System.out.println("Daftar Kendaraan dan Estimasi Biaya Layanan");
        System.out.println("-----------------------------------------------------------");
        
        double totalSeluruhBiaya = 0;
        for (int i = 0; i < pelanggan.getDaftarKendaraan().size(); i++) {
            Kendaraan k = pelanggan.getDaftarKendaraan().get(i);
            Layanan l = layananDipilih[i];
            
            double totalBiaya = k.hitungTotalBiaya(l);
            totalSeluruhBiaya += totalBiaya;
            
            System.out.println((i+1) + ". " + k.getInfo());
            System.out.println("   Layanan Terpilih : " + l.getInfo());
            System.out.println("   Estimasi Biaya   : Rp " + totalBiaya);
            System.out.println("   ---------------------------------------------------");
        }

        System.out.println("Total Estimasi Biaya Keseluruhan : Rp " + totalSeluruhBiaya);
        System.out.println("===========================================================");
    }
}
