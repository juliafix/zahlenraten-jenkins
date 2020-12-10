package com.julia.app;

public class Zufallszahl {

    private int zufallszahl;

    public Zufallszahl() {
        int maxZahl = 10;
        zufallszahl = (int) (Math.random() * maxZahl) + 1;
    }

    /**
     * Vergleicht eine Zahl zur Zufallszahl
     * @param vergleichzahl die Zahl zum Vergleichen
     * @return 1 wenn zu groß, -1 wenn zu klein, 0 wenn gleich
     */
    public int zahlenVergleich(int vergleichzahl) {
        if (vergleichzahl > zufallszahl) {
            return 1;
        } else if (vergleichzahl < zufallszahl) {
            return -1;
        } else {
            return 0;
        }
    }
}
