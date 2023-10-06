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

       
    }

}