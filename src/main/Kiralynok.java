package main;

import modell.Feladat;
import nezet.FrameNezet;

public class Kiralynok {

    public static void main(String[] args) {
        new Kiralynok().ini();
    }

    public void ini() {
        Feladat modell = new Feladat();
        FrameNezet nezet = new FrameNezet();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameNezet().setVisible(true);
            }
        });
    }

}
