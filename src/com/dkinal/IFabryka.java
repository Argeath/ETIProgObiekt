package com.dkinal;

/**
 * @author Dominik Kinal <d.kinal@volanto.pl>
 */
public interface IFabryka {
    Figura zwrocFigure(String typ, int a, int b, int c) throws Wyjatek;
}
