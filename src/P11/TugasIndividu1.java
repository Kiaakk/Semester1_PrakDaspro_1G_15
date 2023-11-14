package P11;

import java.util.Scanner;

public class TugasIndividu1 {
    public static void main(String[] args) {
        
        Scanner input15 = new Scanner(System.in);

        System.out.print("Masukkan nilai n : ");
        int n = input15.nextInt();

        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
