

package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Thing G = new Grej(1, 1996, "Viktor", "Gant");
        Thing D = new Grej(2, 1995, "Erik", "Polo");
        Thing E = new Sak(3, 2001, "Black");
        Thing F = new Sak(9, 1999, "White");
        ArrayList<Thing> personer = new ArrayList<>();
        personer.add(G);
        personer.add(D);
        personer.add(E);
        personer.add(F);

        for (Thing p:personer) {
            System.out.println(p);
            System.out.println(p);
        }

    }

}
