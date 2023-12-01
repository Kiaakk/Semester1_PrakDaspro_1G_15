package P13;

import java.util.Scanner;

public class Percobaan6_15 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.print("Masukkan panjang : ");
        p = input15.nextInt();
        System.out.print("Masukkan lebar : ");
        l = input15.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = input15.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi panjang adalah " + L);
        vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah " + vol);

        // L = p * l;
        // System.out.println("Luas Persegi panjang adalah " + L);

        // vol = p * l * t;
        // System.out.println("Volume balok adalah " + vol);
        input15.close();
    }

     static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

}

