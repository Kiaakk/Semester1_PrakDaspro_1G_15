package P11;

import java.util.Scanner;

public class NestedLoop_2341720253 {
    public static void main(String[] args) {
        
        Scanner sc15 = new Scanner(System.in);
        double[][] array = new double[5][7];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Kota ke-" + (i+1));
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("Hari ke-" + (j+1) + " : ");
                array[i][j] = sc15.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print("Kota ke-" + (i+1) + ": ");
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
