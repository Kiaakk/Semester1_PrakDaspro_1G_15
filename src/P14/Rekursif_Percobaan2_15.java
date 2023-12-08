package P14;

import java.util.Scanner;

public class Rekursif_Percobaan2_15 {

    static Scanner input15 = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan bilangan yang dihitung = ");
        int bilangan = input15.nextInt();

        System.out.print("Pangkat = ");
        int pangkat = input15.nextInt();

        System.out.println("Output:");
        System.out.println(printPangkat(bilangan, pangkat) + " = " + hitungPangkat(bilangan, pangkat));
    }

    static String printPangkat(int x, int y) {
        if (y == 0) {
            return "1";
        } else {
            return x + "x" + printPangkat(x, y - 1);
        }
    }

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * hitungPangkat(x, y - 1);
        }
    }
}
