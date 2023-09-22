package P4;

import java.util.Scanner;

public class Lingkaran15 {

    public static void main(String[] args) {

        Scanner sc15 = new Scanner(System.in);

        int r;
        double keliling, luas;

        System.out.print("Masukkan jari-jari lingkaran : ");
        r = sc15.nextInt();

        keliling = 2*3.14*r;
        luas = 3.14*r*r;

        System.out.println("Keliling = " + keliling);
        System.out.println("Luas = " + luas);
    }
}