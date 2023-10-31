package P9;

import java.util.Scanner;

public class ArrayRataNilai15 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs = input15.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        int lulus = 0;
        int tidakLulus = 0;
        double totalLulus = 0;
        double totalTidaklulus = 0;
        double rataLulus;
        double rataTidklulus;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = input15.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                lulus++;
                totalLulus += nilaiMhs[i];
            } else {
                tidakLulus++;
                totalTidaklulus += nilaiMhs[i];
            }
        }
        rataLulus = totalLulus / lulus;
        rataTidklulus = totalTidaklulus / tidakLulus;
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidklulus);

    }
}

