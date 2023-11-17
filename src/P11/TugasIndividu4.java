package P11;

public class TugasIndividu4 {
    public static void main(String[] args) {
        
        char[] karakter = {'H', 'i', 'z', 'k', 'i', 'a', 'E', 'l', 's', 'a', 'd', 'a', 'n', 't', 'a'};
        char[][] konversi = new char[8][5];
        int jumlah = 8 * 5;

        for (int i = 0; i < jumlah; i++) {
            konversi[i / 5][i % 5] = karakter[i % karakter.length];
        }

        if (karakter.length < jumlah) {
            for (int i = karakter.length; i < jumlah; i++) {
                konversi[i / 5][i % 5] = karakter[i % karakter.length];
            }
        }

        for (int i = 0; i < konversi.length; i++) {
            for (int j = 0; j < konversi[0].length; j++) {
                System.out.print(konversi[i][j] + " ");
            }
            System.out.println();
        }
    }
}
