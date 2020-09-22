package Familia;

import POO.Adulto;
import POO2.Humano;

public interface Familia {

    Adulto getPadre();

    Adulto getMadre();

    Humano[] getHijos();

    Adulto[] getTios();

    Adulto[] getAbuelas();

    Adulto[] getAbuelos();

    void ejecutarAccion();

}
