package P14;

import java.util.Scanner;

public class Rekursif_Percobaan3_15 {
    
    static Scanner sc15 = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Jumlah saldo awal : ");
        int saldo = sc15.nextInt();
        System.out.print("Lamanya investasi (tahun) : ");
        int tahun = sc15.nextInt();

        System.out.print("Jumlah saldo setelah " + tahun + " tahun : ");
        System.out.print(hitungLaba(saldo, tahun));
    }

    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return saldo;
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }
}
