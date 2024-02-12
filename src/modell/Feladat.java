package modell;

import java.util.Random;

public class Feladat {

    private static final Random rnd = new Random();

    private Tabla t;

    public Feladat() {
        t = new Tabla('#');

        megjelenit();
        elhelyez(8);
        
        uresOszlopokSzáma();
        uresSorokSzáma();

    }

    public void megjelenit() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(t.getT()[i][j]);
            }
            System.out.println();
        }
        System.out.println();
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
        megjelenit();
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

    public void uresOszlopokSzáma() {
        int uresOszlopok = 0;
        for (int j = 0; j < 8; j++) {
            if (uresOszlop(j)) {
                uresOszlopok++;
            }
        }
        kiir("Ures oszlopok: " + uresOszlopok);
    }

    public void uresSorokSzáma() {
        int uresSorok = 0;
        for (int i = 0; i < 8; i++) {
            if (uresSor(i)) {
                uresSorok++;
            }
        }
        kiir("Ures sorok: " + uresSorok);
    }

    public void kiir(String msg) {
        System.out.println(msg);
    }
}
