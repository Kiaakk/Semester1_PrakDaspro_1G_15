package P11;

public class TugasIndividu3 {
    public static void main(String[] args) {

        String[][] atlet = {
                {"Hizkia", "Okta", "Dika", "Roy", "Leon"},
                {"Zanur", "Sultan", "Fateh", "Fabian", "Khen"},
                {"Brimanta", "Fadlih", "Dina", "Yesika", "Andreas"},
                {"Edo", "Hanifah", "Justin", "Adam", "Fandy"}
        };

        for (int i = 0; i < atlet.length; i++) {
            String cabor = "";
            switch (i) {
                case 0:
                    cabor = "Badminton";
                    break;
                case 1:
                    cabor = "Tenis Meja";
                    break;
                case 2:
                    cabor = "Basket";
                    break;
                case 3:
                    cabor = "Bola Voly";
                    break;
                default:
                    cabor = "Cabang Olahraga Tidak Dikenal";
                    break;
            }
            System.out.println("Cabang Olahraga: " + cabor);

            for (int j = 0; j < atlet[i].length - 1; j++) {
                for (int n = 0; n < atlet[i].length - j - 1; n++) {
                    if (atlet[i][n].compareTo(atlet[i][n + 1]) > 0) {
                        String temp = atlet[i][n];
                        atlet[i][n] = atlet[i][n + 1];
                        atlet[i][n + 1] = temp;
                    }
                }
            }

            for (int j = 0; j < atlet[i].length; j++) {
                System.out.println("  " + atlet[i][j]);
            }
            System.out.println();
        }
    }
}
