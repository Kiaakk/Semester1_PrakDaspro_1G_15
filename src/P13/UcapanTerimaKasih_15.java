package P13;

import java.util.Scanner;

public class UcapanTerimaKasih_15 {

    static Scanner sc15 = new Scanner(System.in);
    public static void main(String[] args) {
        UcapanTerimaKasih();
        UcapanTambahan();
    }

    public static String PenerimaUcapan() {
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = sc15.nextLine();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" +
        "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static String UcapanTambahan() {
        System.out.println("Tuliskan ucapan tambahan :");
        String ucapTambah = sc15.nextLine();
        return ucapTambah;
    }
}
