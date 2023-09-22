package P4;

import java.util.Scanner;

public class HargaBayar15 {
    
    public static void main(String[] args) {
        
        Scanner sc15 = new Scanner(System.in);

        int harga, jumlah, jmlHalBuku;
        double dis, total, bayar, jmlDis;
        String merk;

        System.out.print("Masukkan harga barang yang dibeli ");
        harga = sc15.nextInt();
        System.out.print("Masukkan jumlah barang yang dibeli ");
        jumlah = sc15.nextInt();

        sc15.nextLine();
        System.out.print("Merk buku yang dibeli ");
        merk = sc15.nextLine();
        System.out.print("Jumlah halaman buku ");
        jmlHalBuku = sc15.nextInt();
        System.out.print("Besar diskon yang diperoleh ");
        dis = sc15.nextDouble();

        total = harga*jumlah;
        jmlDis = total*dis;
        bayar = total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);

    }
}
