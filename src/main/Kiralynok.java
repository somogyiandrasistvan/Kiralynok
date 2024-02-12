package main;

import modell.Feladat;
import nezet.FrameNezet;
import vezerlo.KonzolVezerlo;

public class Kiralynok {

    public static void main(String[] args) {
        new Kiralynok().ini();
    }

    public void ini() {
        Feladat modell = new Feladat();
        Feladat modell2 = new Feladat();
        new KonzolVezerlo(modell);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameNezet().setVisible(true);
            }
        });
    }

}
