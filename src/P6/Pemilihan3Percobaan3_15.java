package P6;

import java.util.Scanner;

public class Pemilihan3Percobaan3_15 {

    public static void main(String[] args) {
        
        Scanner input15 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Kategori Pekerjaan : ");
        kategori = input15.next();

        System.out.print("Besar Penghasilan : ");
        penghasilan = input15.nextInt();

        if (kategori.equalsIgnoreCase("Pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
            gajiBersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.println("Gaji Bersih : " + gajiBersih);
        } else if (kategori.equalsIgnoreCase("Pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } else {
                pajak = 0.25;
            }
            gajiBersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.println("Gaji Bersih : " + gajiBersih);
        } else {
            System.out.println("Kategori Salah");
        }

    }
}
