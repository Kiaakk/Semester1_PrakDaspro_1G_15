package P13;

import java.util.Scanner;

public class UcapanTerimaKasih_15 {
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }

    public static String PenerimaUcapan() {
        Scanner sc15 = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = sc15.nextLine();
        sc15.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" +
        "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }
}
