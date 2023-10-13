package P7;

import java.util.Scanner;

public class WhileGaji15 {
    
    public static void main(String[] args) {
        
        Scanner input15 = new Scanner(System.in);

        int jumlahKaryawan, jumalhJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan       : ");
        jumlahKaryawan = input15.nextInt();

        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + " : ");
            jabatan = input15.next();
            System.out.print("Masukkan jumlah jam lembur     : ");
            jumalhJamLembur = input15.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")){
                gajiLembur = jumalhJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumalhJamLembur * 75000;
            }
            totalGajiLembur += gajiLembur;
        }

        System.out.println("Total gaji lembur = " + totalGajiLembur);

    }
}
