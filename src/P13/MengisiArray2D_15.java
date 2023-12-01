package P13;

import java.util.Scanner;

public class MengisiArray2D_15 {

    static Scanner input15 = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan banyak mahasiswa : ");
        int jumlahMahasiswa = input15.nextInt();
        System.out.print("Masukkan banyak tugas : ");
        int jumlahMinggu = input15.nextInt();    
        
        String[] students = new String[jumlahMahasiswa];
        int[][] nilaiMawa = new int[jumlahMahasiswa][jumlahMinggu];
        
        inputMahasiswa(students);
        inputNilai(students, nilaiMawa);
        pelaporanNilai(students, nilaiMawa);
        highestValue(nilaiMawa);
        studentsHighScore(students, nilaiMawa);
    }

    public static void inputMahasiswa(String[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            students[i] = input15.next();
        }
    }

    public static void inputNilai(String[] students, int[][] nilaiMawa) {
        for (int i = 0; i < students.length; i++) {
            System.out.println("Masukkan nilai tugas " + students[i]);
            for (int j = 0; j < nilaiMawa[i].length; j++) {
                System.out.print("Minggu ke-" + (j + 1) + " : ");
                nilaiMawa[i][j] = input15.nextInt();
            }
            System.out.println();
        }
    }

    public static void pelaporanNilai(String[] students, int[][] nilaiMawa) {
        System.out.print("Nama\t\t");

        for (int i = 0; i < nilaiMawa[0].length; i++) {
            System.out.print("Minggu ke-" + (i + 1) + "\t");
        }
        System.out.println();

        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + "\t\t");
            for (int j = 0; j < nilaiMawa[i].length; j++) {
                System.out.print(nilaiMawa[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    public static void highestValue(int[][] nilaiMawa) {
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

    public static void studentsHighScore(String[] students, int[][] nilaiMawa) {
        int nilaiTertinggi = 0;
        int mawaTertinggi = 0;

        for (int i = 0; i < nilaiMawa.length; i++) {
            int totalNilaiMawa = 0;
            for (int j = 0; j < nilaiMawa[i].length; j++) {
                totalNilaiMawa += nilaiMawa[i][j];
            }
            if (totalNilaiMawa > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiMawa;
                mawaTertinggi = i;
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + students[mawaTertinggi] + " dengan total nilai " + nilaiTertinggi);
    }
}
