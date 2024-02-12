package modell;

public class Feladat {

    private Tabla[] tablak;

    public Feladat() {
        Tabla t1 = new Tabla('#');

        megjelenit(t1);
    }

    public Tabla[] getTabla() {
        return tablak;
    }

    public void megjelenit(Tabla t1) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(t1.getT()[i][j]);
            }
            System.out.println();
        }
    }

}
