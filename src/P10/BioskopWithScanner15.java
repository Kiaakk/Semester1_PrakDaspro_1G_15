package P10;
import java.util.Scanner;

public class BioskopWithScanner15 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next, back;
        boolean isFind = false;
        boolean isBund = false;
        String[][] penonton = new String[4][2];
        
        while (!isFind) {
            System.out.println("Pilih Menu");
            System.out.println("1. Input data penonton");
            System.out.println("2. Daftar penonton");
            System.out.println("3. Exit");

            System.out.print("Pilihan Menu : ");
            menu = input15.nextInt();
            input15.nextLine();

            switch (menu) {
                case 1:
                    while (!isBund) {
                        System.out.print("Masukkan nama : ");
                        nama = input15.nextLine();
                        
                        while (true) {
                            System.out.print("Masukkan baris (1-4) : ");
                            baris = input15.nextInt();
                            input15.nextLine();
                            if (baris >= 1 && baris <= 4) {
                                break;
                            } else {
                                System.out.println("Input di luar batas. Input kembali (1-4)");
                            }
                        }

                        while (true) {
                            System.out.print("Masukkan kolom (1-2) : ");
                            kolom = input15.nextInt();
                            input15.nextLine();
                            if (kolom >= 1 && kolom <= 2) {
                                break;
                            } else {
                                System.out.println("Input di luar batas. Input kembali (1-2)");
                            }
                        }
                        
                        penonton [baris-1][kolom-1] = nama;
                       
                        System.out.print("Input penonton lainnya? (y/n) : ");
                        next = input15.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            isBund = true;
                            break;
                        }
                    }
                    
                    break;
                    
                case 2:
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.println("Pada baris ke-" + (i+1) + " : " + String.join(", ", penonton[i]));
                    }

                    System.out.print("Balik ke menu? (y/n) : ");
                    back = input15.nextLine();

                    if (back.equalsIgnoreCase("n")) {
                        isFind = true;
                    }
                    break;

                case 3:
                    isFind = true;
                    break;
            
            }
        }
    
    }
}