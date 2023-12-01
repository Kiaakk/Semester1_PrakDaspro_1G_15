package P13;

import java.util.Scanner;

public class Ucapan_15 {
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + "\nMay the force be with you.");
    }
    
    public static String PenerimaUcapan() {
        Scanner sc15 = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = sc15.nextLine();
        sc15.close();
        return namaOrang;
    }
}
