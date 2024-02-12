package modell;

import java.util.Random;

public class Tabla {

    private char[][] T;
    private char UresCella;

    private static final Random rnd = new Random();

    public Tabla(char UresCella) {
        T = new char[8][8];
        this.UresCella = UresCella;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                T[i][j] = UresCella;
            }
        }
    }

    public char[][] getT() {
        return T;
    }

    public char getUresCella() {
        return UresCella;
    }

    public void elhelyez(int N) {
        for (int i = 0; i < N; i++) {
            int sor, oszlop;
            do {
                sor = rnd.nextInt(8);
                oszlop = rnd.nextInt(8);
            } while (getT()[sor][oszlop] != getUresCella());
            getT()[sor][oszlop] = 'K';
        }
    }

    public String megjelenit() {
        String str = "";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                str += getT()[i][j];
            }
            str += "\n";
        }
        str += "\n";

        return str;
    }

}
