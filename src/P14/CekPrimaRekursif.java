package P14;

import java.util.Scanner;

public class CekPrimaRekursif {

    static  Scanner sc15 = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Masukkan nilai n: ");
        int n = sc15.nextInt();

        if (cekPrimaRekursif(n, 2)) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }

    static boolean cekPrimaRekursif(int n, int pembagi) {
        if (n <= 1) {
            return false;
        } else if (pembagi == n) {
            return true;
        } else if (n % pembagi == 0) {
            return false;
        } else {
            return cekPrimaRekursif(n, pembagi + 1);
        }
    }
}

