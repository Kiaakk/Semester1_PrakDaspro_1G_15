package P11;

import java.util.Scanner;

public class Square15 {
    public static void main(String[] args) {
        
        Scanner sc15 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc15.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
