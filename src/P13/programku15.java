package P13;

public class programku15 {
    public static void main(String[] args) {
        int temp = Jumlah(1, 1);
        TampilJumlah(temp, 5);
    }

    public static void TampilHinggaKei(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
    }

    public static int Jumlah(int bil1, int bil2) {
        return (bil1 + bil2);  
    }

    public static void TampilJumlah(int bil1, int bil2) {
        TampilHinggaKei(Jumlah(bil1, bil2));
    }
}
