package P7;

import java.util.Scanner;

public class DoWhileCuti15 {
    
    public static void main(String[] args) {
        
        Scanner input15 = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi; 

        System.out.print("Jatah cuti : ");
        jatahCuti = input15.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/n) ? ");
            konfirmasi = input15.next();

            if (konfirmasi.equalsIgnoreCase(konfirmasi)) {
                System.out.print("Jumlah hari : ");
                jumlahHari = input15.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi dan hanya tersisa " + jatahCuti);
                    continue;
                }
            }
        } while (jatahCuti > 0);
    }
}
