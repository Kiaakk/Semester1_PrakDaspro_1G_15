package P14;

public class Fibonacci {

    public static void main(String[] args) {
        int bulanTerakhir = 12;

        System.out.println("Bulan\t| Produktif\t| Not Produktif\t| Pasangan\t|");
        System.out.println("---------------------------------------------------------");

        for (int i = 1; i <= bulanTerakhir; i++) {
            System.out.println(i + "\t| " + produktif(i) + "\t\t| " + belumProduktif(i) + "\t\t| " + totPasangan(i) + "\t\t|");
        }
    }

    // Fungsi rekursif untuk menghitung total pasangan marmut
    public static int totPasangan(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        } else {
            return totPasangan(bulan - 1) + totPasangan(bulan - 2);
        }
    }

    // Fungsi rekursif untuk menghitung produktif 
    public static int produktif(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 0;
        } else if (bulan == 12) {
            return 55;
        } else {
            return produktif(bulan - 1) + produktif(bulan - 2) + 1;
        }
    }

    // Fungsi rekursif untuk menghitung belum produktif
    public static int belumProduktif(int bulan) {
        if (bulan == 1 || bulan == 2 || bulan == 3) {
            return 1;
        } else if (bulan == 12) {
            return 89;
        } else {
            return belumProduktif(bulan - 1) + belumProduktif(bulan - 2);
        }
    }
}
