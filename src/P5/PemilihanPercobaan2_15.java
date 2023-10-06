package P5;

import java.util.Scanner;

public class PemilihanPercobaan2_15 {
    public static void main(String[] args) {

        Scanner input15 = new Scanner(System.in);
        float uas, uts, kuis, tugas, total;

        System.out.print("Nilai UAS : ");
        uas = input15.nextFloat();

        System.out.print("Nilai UTS : ");
        uts = input15.nextFloat();

        System.out.print("Nilai KUIS : ");
        kuis = input15.nextFloat();

        System.out.print("Nilai TUGAS : ");
        tugas = input15.nextFloat();

        total = (uas * 0.4F + uts * 0.3F + kuis * 0.1F + tugas * 0.2F);

        String message = (total < 65) ? "Remidi" : "Tidak Remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);

        if (total > 80 && total <= 100) {
            System.out.println("Nilai anda adalah A");
        } else if (total > 73 && total <= 80 ) {
            System.out.println("Nilai anda adalah B+");
        } else if (total > 65 && total <= 73) {
            System.out.println("Nilai anda adalah B");
        } else if (total > 60 && total <= 65) {
            System.out.println("Nilai anda adalah C+");
        } else if (total > 50 && total <= 60) {
            System.out.println("Nilai anda adalah C");
        } else if (total > 39 && total <= 50) {
            System.out.println("Nilai anda adalah D");
        } else{
            System.out.println("Nilai anda adalah E");
        }
    }

}