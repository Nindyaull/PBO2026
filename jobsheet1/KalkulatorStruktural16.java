package jobsheet1;

import java.util.Scanner;

public class KalkulatorStruktural16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;

        System.out.println("=== Kalkulator ===");
        System.out.print("Masukkan angka 1 : ");
        angka1 = sc.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /) : ");
        operator = sc.next().charAt(0);
        System.out.print("Masukkan angka 2 : ");
        angka2 = sc.nextDouble();

        hasil = hitung(angka1, angka2, operator);
        System.out.println("Hasil : " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
        sc.close();
    }

    public static double hitung(double a, double b, char op) {
        double nilaiHasil = 0;

        switch (op) {
            case '+':
                nilaiHasil = a + b;
                break;
            case '-':
                nilaiHasil = a - b;
                break;
            case '*':
                nilaiHasil = a * b;
                break;
            case '/':
                if (b != 0) {
                    nilaiHasil = a / b;
                } else {
                    System.out.println("Tidak Terdefinisi!");
                }
                break;
            default:
                System.out.println("Error, operator tidak dikenali");
        }

        return nilaiHasil;
    }
}
