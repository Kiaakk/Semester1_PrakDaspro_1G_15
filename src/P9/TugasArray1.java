package P9;

import java.util.Scanner;

public class TugasArray1 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        System.out.print("Jumlah elemen array : ");
        int jumlah = input15.nextInt();
        int[] nilai = new int[jumlah];

        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Elemen array ke-" + i + " : ");
            nilai[i] = input15.nextInt();
            total += nilai[i];
        }
        int maks = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > maks) {
                maks = nilai[i];
            }
        }
        int min = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }

        int rata2 = total / nilai.length;
        System.out.println("Nilai terbesar : " + maks);
        System.out.println("Nilai terkecil : " + min);
        System.out.println("Rata-rata nya adalah : " + rata2);
    }
}
