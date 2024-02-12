package modell;

import java.util.Random;

public class Feladat {

    private static final Random rnd = new Random();

    private Tabla t;

    public Feladat() {
        t = new Tabla('#');
        System.out.println(t.megjelenit());
        t.elhelyez(8);
        System.out.println(t.megjelenit());

        uresOszlopokSzáma();
        uresSorokSzáma();
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
