package com.dkinal;

/**
 * @author Dominik Kinal <d.kinal@volanto.pl>
 */
class FabrykaFigur implements IFabryka {

    @Override
    public Figura zwrocFigure(String typ, int a, int b, int c) throws Wyjatek {
        typ = typ.toLowerCase();
        switch(typ) {
            case "trojkat":
                return new Trojkat(a, b, c);
            case "prostokat":
                return new Prostokat(a, b);
        }
        throw new Wyjatek(typ);
    }
}
