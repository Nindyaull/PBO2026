package jobsheet7;

public class Segitiga {
    private int sudut;

    // overloading totalSudut 1 parameter
    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    // overloading totalSudut 2 parameter
    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    // overloading keliling 3 parameter
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // overloading keliling versi 2 parameter
    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
    }

    public static void main(String[] args) {
        Segitiga a = new Segitiga();
        System.out.println("Total 1 sudut                    : " + a.totalSudut(70));
        System.out.println("Total 2 sudut                    : " + a.totalSudut(30, 50));
        System.out.println("Keliling 3 sisi                  : " + a.keliling(2, 3, 4));
        System.out.println("Keliling (Sisi miring Siku-Siku) : " + a.keliling(3, 4));
    }
}
