package P13;

import java.util.Scanner;

public class MengisiArray2D_15 {

    public static int jumlahMinggu = 7;
    public static String[] students = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
    public static int[][] nilaiMawa = new int[students.length][jumlahMinggu];
    static Scanner input15 = new Scanner(System.in);

    public static void main(String[] args) {
        inputNilai();
        pelaporanNilai();
        highestValue();
        studentsHighScore();
    }

    public static void inputNilai() {
        for (int i = 0; i < students.length; i++) {
            System.out.println("Masukkan nilai tugas " + students[i]);
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.print("Minggu ke-" + (j + 1) + " : ");
                nilaiMawa[i][j] = input15.nextInt();
            }
            System.out.println();
        }
    }

    public static void pelaporanNilai() {
        System.out.print("Nama\t\t");

        for (int i = 0; i < jumlahMinggu; i++) {
            System.out.print("Minggu ke-" + (i+1) + "\t");
        }
        System.out.println();

        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + "\t\t");
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.print(nilaiMawa[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    public static void highestValue() {
        int nilaiTertinggi = 0;
        int mingguTertinggi = 0;

        for (int i = 0; i < nilaiMawa.length; i++) {
            for (int j = 0; j < nilaiMawa[i].length; j++) {
                if (nilaiTertinggi < nilaiMawa[i][j]) {
                    mingguTertinggi = j + 1;
                    nilaiTertinggi = nilaiMawa[i][j];
                }
            }
        }
        System.out.println("Nilai tertinggi adalah " + nilaiTertinggi + " pada Minggu ke-" + mingguTertinggi);
    }

    public static void studentsHighScore() {
        int nilaiTertinggi = 0;
        int mawaTertinggi = 0;

        for (int i = 0; i < nilaiMawa.length; i++) {
            for (int j = 0; j < nilaiMawa[i].length; j++) {
                if (nilaiTertinggi < nilaiMawa[i][j]) {
                    nilaiTertinggi = nilaiMawa[i][j];
                    mawaTertinggi = i;
                }
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + students[mawaTertinggi] + " dengan total nilai " + nilaiTertinggi);
    }

}
