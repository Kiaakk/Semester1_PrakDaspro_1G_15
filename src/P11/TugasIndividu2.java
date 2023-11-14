package P11;

import java.util.Scanner;

public class TugasIndividu2 {
    public static void main(String[] args) {
        
        Scanner input15 = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int n = input15.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  ");
                }
            }System.out.print("\n");
        }
    }
}
