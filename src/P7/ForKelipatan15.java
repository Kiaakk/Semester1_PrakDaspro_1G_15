package P7;

import java.util.Scanner;

public class ForKelipatan15 {

    public static void main(String[] args) {
        
        Scanner input15 = new Scanner(System.in);

        int kelipatan, jumlah=0, counter=0;
        double rataRata = 0;

        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = input15.nextInt();

        for (int i=1;i<=50;i++) {
            if (i%kelipatan == 0) {
                jumlah += i;
                counter ++;
                rataRata = (double)jumlah/counter;
            }
        }

        System.out.println("Banyaknya bilangan " + kelipatan + " dari 1 sampai 50 adalah " + counter);
        System.out.println("Jumlah bilangan kelipatan " + kelipatan + " dari 1 sampai 50 adalah " + jumlah);
        System.out.println("Rata-rata dari seluruh bilangan kelipatan " + kelipatan + " adalah " + rataRata);
    }
}