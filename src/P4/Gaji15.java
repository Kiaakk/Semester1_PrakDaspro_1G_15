package P4;

import java.util.Scanner;

public class Gaji15 {
    
    public static void main(String[] args) {
        
        Scanner sc15 = new Scanner(System.in);

        int jmlMasuk, JmlTdkMasuk, TotGaji;
        int gaji, potGaji;

        System.out.print("Masukkan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk = sc15.nextInt();
        System.out.print("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
        JmlTdkMasuk = sc15.nextInt();
        System.out.print("Masukkan Jumlah Gaji ");
        gaji = sc15.nextInt();
        System.out.print("Masukkan Jumlah Potongan Gaji ");
        potGaji = sc15.nextInt();

        TotGaji = (jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);

        System.out.println("Gaji yang anda terima adalah " + TotGaji);

    }
}
