package vezerlo;

import modell.Feladat;
import nezet.KonzolNezet;

public class KonzolVezerlo {

    private KonzolNezet nezet;
    private Feladat modell;

    public KonzolVezerlo() {
        nezet = new KonzolNezet();
        modell = new Feladat();
        mutat();
    }

    public void mutat() {
        nezet.Kiir("4. feladat: Az üres tábla");
        nezet.Kiir(modell.megjelenit());
        nezet.Kiir("6. feladat: A feltöltött tábla");
        modell.elhelyez(8);
        nezet.Kiir(modell.megjelenit());
        nezet.Kiir("9. feladat: Üres oszlopok és sorok száma");
        nezet.Kiir("Oszlopok: " + modell.uresOszlopokSzáma());
        nezet.Kiir("Sorok: " + modell.uresSorokSzáma());

    }

}
