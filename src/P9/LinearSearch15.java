package P9;

import java.util.Scanner;

public class LinearSearch15 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array : ");
        int jmlArray = input15.nextInt();
        int[] isiArray = new int[jmlArray];

        for (int i = 0; i < jmlArray; i++) {
            System.out.print("Masukkan elemen array ke-"+i+" : ");
            isiArray[i]= input15.nextInt();
        }
        System.out.print("Masukkan key yang ingin dicari : ");
        int key = input15.nextInt();

        int hasil = 0;
        boolean isFind = false;
        for (int i = 0; i < jmlArray; i++) {
            if (isiArray[i] == key) {
                hasil = i;
                isFind = true;
                break;
            } else {
                isFind = false;
            }
        }
        if (isFind) {
            System.out.println("Key ada di posisi indeks ke-"+hasil);
        } else {
            System.out.println("Key tidak ditemukan");
        }

    }
}
