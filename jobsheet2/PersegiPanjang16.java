package jobsheet2;

public class PersegiPanjang16 {
    public int panjang;
    public int lebar;

    public int getLuas() {
        return (panjang * lebar);
    }

    public int getKeliling() {
        return (2 * (panjang + lebar));
    }

    public void displayInfo() {
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar   : " + lebar);
        System.out.println("----------------------------------------");
        System.out.println("Luas Persegi Panjang     : " + getLuas());
        System.out.println("Keliling Persegi Panjang : " + getKeliling());
    }
}
