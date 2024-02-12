package modell;

public class Tabla {

    private char[][] T;
    private char UresCella;

    public Tabla(char UresCella) {
        T = new char[8][8];
        this.UresCella = UresCella;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                T[i][j] = UresCella;
            }
        }
    }

}
