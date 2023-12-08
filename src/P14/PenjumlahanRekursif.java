package P14;

import java.util.Scanner;

public class PenjumlahanRekursif {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai f: ");
        int f = sc.nextInt();

        int hasil = penjumlahanRekursif(f);

        System.out.println("Penjumlahan dari 1 sampai " + f + " adalah: " + hasil);

        sc.close();
    }

    static int penjumlahanRekursif(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
    }
}

