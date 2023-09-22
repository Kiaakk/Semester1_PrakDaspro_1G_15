package P4;

import java.util.Scanner;

public class HargaBayar15 {
    
    public static void main(String[] args) {
        
        Scanner sc15 = new Scanner(System.in);

        int harga, jumlah;
        double dis = 0.1, total, bayar, jmlDis;

        System.out.print("Masukkan harga barang yang dibeli ");
        harga = sc15.nextInt();
        System.out.print("Masukkan jumlah barang yang dibeli ");
        jumlah = sc15.nextInt();

        total = harga*jumlah;
        jmlDis = total*dis;
        bayar = total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);

    }
}
