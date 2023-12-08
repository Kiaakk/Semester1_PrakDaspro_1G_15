package P14;

import java.util.Scanner;

public class PenjumlahanRekursif {

    static Scanner sc15 = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Masukkan nilai f: ");
        int f = sc15.nextInt();

        System.out.print("Penjumlahan dari 1 sampai " + f + " adalah: ");
        int hasil = penjumlahanRekursif(f, 1);
        System.out.print(" = " + hasil);
    }

    static int penjumlahanRekursif(int n, int step) {
        if (n <= 1) {
            System.out.print(n);
            return n;
        } else {
            int hasil = penjumlahanRekursif(n - 1, step);
            System.out.print(" + " + n);
            return n + hasil;
        }
    }
}
