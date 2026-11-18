package Jobsheet10.Kereta;

public abstract class KeretaEkspres extends KeretaApi implements Movement, PowerSupply, EmergencyBrake{
    private int jumlahGerbong;

    public KeretaEkspres(String nomorKereta, String masinis, int kecepatanMax, int jumlahGerbong){
        super(nomorKereta, masinis, kecepatanMax);
        this.jumlahGerbong = jumlahGerbong;
    }

    public int getJumlahGerbong(){
        return jumlahGerbong;
    }

    public void setJumlahGerb0ng (int jumlahGerbong){
        this.jumlahGerbong = jumlahGerbong;
    }

    // tambahan untuk no 2 (implementasi interface ke subclass abstrak)
    @Override 
    public void maju() {
        System.out.println("Kereta Ekspres berjalan maju dengan batas kecepatan " + batasKecepatanMax + " km/h");
    }
}
