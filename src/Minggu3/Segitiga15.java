package Minggu3;

import java.util.Scanner;

public class Segitiga15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        int alas, tinggi;
        float luas;

        System.out.println("Masukkan alas: ");
        alas = sc15.nextInt();
        System.out.println("Masukkan tinggi: ");
        tinggi = sc15.nextInt();

        luas = alas * tinggi / 2;
        System.out.println("Luas segitiga: " + luas);
    }
}
