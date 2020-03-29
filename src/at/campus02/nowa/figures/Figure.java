package at.campus02.nowa.figures;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public abstract class Figure {
    protected int faktor;
    protected char[][] symbol = new char[3][3];

    protected Figure(int faktor){
        this.faktor = faktor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(symbol[i][0]);
            sb.append(symbol[i][1]);
            sb.append(symbol[i][2]);
            sb.append("\n");
        }
        //TODO: Implementieren der Ausgabe in einen StringBuilder
        return sb.toString();
    }
}
