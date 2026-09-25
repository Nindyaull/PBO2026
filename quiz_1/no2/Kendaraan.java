package quiz_1.no2;

public class Kendaraan {
    private String platNomor;
    private String merek;
    private String model;
    private String tipeKendaraan;
    private Pelanggan pemilik;

    public Kendaraan(String platNomor, String merek, String model, String tipeKendaraan) {
        this.platNomor = platNomor;
        this.merek = merek;
        this.model = model;
        this.tipeKendaraan = tipeKendaraan;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTipeKendaraan() {
        return tipeKendaraan;
    }

    public void setTipeKendaraan(String tipeKendaraan) {
        this.tipeKendaraan = tipeKendaraan;
    }

    public Pelanggan getPemilik() {
        return pemilik;
    }

    public void setPemilik(Pelanggan pemilik) {
        this.pemilik = pemilik;
    }

    // Menghitung total biaya berdasarkan aturan jenis kendaraan
    public double hitungTotalBiaya(Layanan layanan) {
        double biayaLayananSistem = 0;

        if (tipeKendaraan.equalsIgnoreCase("Mobil")) {
            biayaLayananSistem = 50000;
        } else if (tipeKendaraan.equalsIgnoreCase("Sepeda Motor")) {
            biayaLayananSistem = 20000;
        }

        return layanan.getServicePrice() + biayaLayananSistem;
    }

    public String getInfo() {
        return tipeKendaraan + " - " + merek + " " + model + " [" + platNomor + "]";
    }
}
