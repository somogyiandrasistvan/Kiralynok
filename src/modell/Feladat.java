package modell;

import java.util.Random;

public class Feladat {

    private static final Random rnd = new Random();

    private Tabla t;

    public Feladat() {
        t = new Tabla('#');
    }

    public void elhelyez(int N) {
        for (int i = 0; i < N; i++) {
            int sor, oszlop;
            do {
                sor = rnd.nextInt(8);
                oszlop = rnd.nextInt(8);
            } while (t.getT()[sor][oszlop] != t.getUresCella());
            t.getT()[sor][oszlop] = 'K';
        }
    }

    public String megjelenit() {
        String str = "";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                str += t.getT()[i][j];
            }
            str += "\n";
        }

        return str;
    }

    public boolean uresOszlop(int oszlop) {
        for (int i = 0; i < 8; i++) {
            if (t.getT()[i][oszlop] == 'K') {
                return false;
            }
        }
        return true;
    }

    public boolean uresSor(int sor) {
        for (int j = 0; j < 8; j++) {
            if (t.getT()[sor][j] == 'K') {
                return false;
            }
        }
        return true;
    }

    public String uresOszlopokSzáma() {
        int uresOszlopok = 0;
        for (int j = 0; j < 8; j++) {
            if (uresOszlop(j)) {
                uresOszlopok++;
            }
        }
        String str = "Oszlopok: " + uresOszlopok;

        return str;
    }

    public String uresSorokSzáma() {
        int uresSorok = 0;
        for (int i = 0; i < 8; i++) {
            if (uresSor(i)) {
                uresSorok++;
            }
        }
        String str = "Sorok: " + uresSorok;

        return str;
    }

    public Tabla getT() {
        return t;
    }

}
