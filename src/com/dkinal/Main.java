package com.dkinal;

/**
 * @author Dominik Kinal <d.kinal@volanto.pl>
 */
public class Main {

    public static void main(String[] args) {
        FabrykaFigur fabrykaFigur = new FabrykaFigur();
        try {
            Figura trojkat = fabrykaFigur.zwrocFigure("Trojkat", 3, 4, 5);
            System.out.println(trojkat);
        } catch(Wyjatek w) {
            System.out.println(w);
        }

        try {
            Figura trojkat2 = fabrykaFigur.zwrocFigure("Trojkat", 5, 5, 6);
            System.out.println(trojkat2);
        } catch(Wyjatek w) {
            System.out.println(w);
        }

        try {
            Figura prostokat = fabrykaFigur.zwrocFigure("prostokat", 3, 4, 0);
            System.out.println(prostokat);
        } catch(Wyjatek w) {
            System.out.println(w);
        }

        try {
            Figura nieznanaFigura = fabrykaFigur.zwrocFigure("romb", 3, 1, 3);
            System.out.println(nieznanaFigura);
        } catch(Wyjatek w) {
            System.out.println(w);
        }
    }
}
