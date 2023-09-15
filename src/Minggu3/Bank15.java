package Minggu3;

import java.util.Scanner;

public class Bank15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        int jml_tabungan_awal, lama_menabung;
        double presentase_bunga = 0.02, bunga, jml_tabungan_akhir;

        System.out.println("Masukkan jumlah tabungan awal anda");
        jml_tabungan_awal = sc15.nextInt();
        System.out.println("Masukkan lama menabung anda");
        lama_menabung = sc15.nextInt();

        bunga = lama_menabung * presentase_bunga * jml_tabungan_awal;
        jml_tabungan_akhir =  bunga + jml_tabungan_awal;

        System.out.println("Bunga adalah " + bunga);
        System.out.println("Jumlah tabungan akhir anda adalah " + jml_tabungan_akhir);
    }
}
