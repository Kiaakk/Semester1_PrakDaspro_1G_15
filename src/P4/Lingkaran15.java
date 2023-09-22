package P4;

import java.util.Scanner;

public class Lingkaran15 {

    public static void main(String[] args) {

        Scanner sc15 = new Scanner(System.in);

        int r;
        double keliling, luas, phi = 3.14;

        System.out.print("Masukkan jari-jari lingkaran : ");
        r = sc15.nextInt();

        keliling = 2*phi*r;
        luas = phi*r*r;

        System.out.println("Keliling = " + keliling);
        System.out.println("Luas = " + luas);
    }
}