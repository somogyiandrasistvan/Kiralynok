package modell;

import java.util.Random;

public class Feladat {

    private static final Random rnd = new Random();

    private Tabla t;

    public Feladat() {
        t = new Tabla('#');

        megjelenit();
        elhelyez(8);
        UresOszlop(2);
        UresSor(3);
        
    }

    public void megjelenit() {
        System.out.println();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(t.getT()[i][j]);
            }
            System.out.println();
        }
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

    public boolean UresOszlop(int oszlop) {
        for (int i = 0; i < 8; i++) {
            if (t.getT()[i][oszlop] == 'K') {
                return false;
            }
        }
        return true;
    }

    public boolean UresSor(int sor) {
        for (int j = 0; j < 8; j++) {
            if (t.getT()[sor][j] == 'K') {
                return false;
            }
        }
        return true;
    }
}
