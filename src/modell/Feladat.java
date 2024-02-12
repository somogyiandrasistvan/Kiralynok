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

        System.out.println(uresOszlopokSzáma());
        System.out.println(uresSorokSzáma());
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
        String str = "Ures oszlopok: " + uresOszlopok;

        return str;
    }

    public String uresSorokSzáma() {
        int uresSorok = 0;
        for (int i = 0; i < 8; i++) {
            if (uresSor(i)) {
                uresSorok++;
            }
        }
        String str = "Ures sorok: " + uresSorok;

        return str;
    }

    public void kiir(String msg) {
        System.out.println(msg);
    }

}
