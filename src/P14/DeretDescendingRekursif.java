package P14;

import java.util.Scanner;

public class DeretDescendingRekursif {

    static Scanner sc15 = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Masukkan nilai n: ");
        int n = sc15.nextInt();

        System.out.println("Menggunakan Fungsi Rekursif:");
        deretDescendingRekursif(n);

        System.out.println("\n\nMenggunakan Fungsi Iteratif:");
        deretDescendingIteratif(n);
    }

    // Fungsi Rekursif
    static void deretDescendingRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretDescendingRekursif(n - 1);
        }
    }

    // Fungsi Iteratif
    static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}

