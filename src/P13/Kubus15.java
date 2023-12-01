package P13;

import java.util.Scanner;

public class Kubus15 {
    static Scanner input15 = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan panjang sisi kubus = ");
        int sisi = input15.nextInt();
        int V = volKubus(sisi);
        System.out.println("Volume kubus dengan sisi " + sisi + " adalah = " + V);
        int lP = lpKubus(sisi);
        System.out.println("Luas permukaan kubus dengan sisi " + sisi + " adalah = " + lP);
    }
    public static int volKubus(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }
    public static int lpKubus(int sisi) {
        int luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }
}
