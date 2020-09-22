package Familia;

import java.util.Arrays;

import POO.Adolescente;
import POO.Adulto;
import POO.Niño;
import POO2.Humano;

public class FamiliaSanchez implements Familia {

    private final Adulto padre = new Adulto("Juan", "Sanchez", 43);    
    private final Adulto madre = new Adulto("Maria", "Sanchez", 42);
    private final Humano[] hijos = { new Niño("Pedrito", "Sanchez ", 8), new Adolescente("Juan", "Sanzhez ", 20) };
    private final Adulto[] tios = { new Adulto("Apple", "Sanchez", 40), new Adulto("Bill", "Sanchez", 50) };
    private final Adulto[] abuelas = { new Adulto("Marisa", "Sanchez", 89), new Adulto("Teresa", "Sanchez", 92) };
    private final Adulto[] abuelos = { new Adulto("Pablo", "Sanchez", 90), new Adulto("Juan", "Sanchez" , 85) };

    @Override
    public Adulto getPadre() {
        return padre;
    }

    @Override
    public Adulto getMadre() {
        return madre;
    }

    @Override
    public Humano[] getHijos() {
        return hijos;
    }

    @Override
    public Adulto[] getTios() {
        return tios;
    }

    @Override
    public Adulto[] getAbuelas() {
        return abuelas;
    }

    @Override
    public Adulto[] getAbuelos() {
        return abuelos;
    }

    @Override
    public void ejecutarAccion() {
        System.out.println("\n La FamiliaSanchez  es muy pacifista: \n " + toString());
    }

    @Override
    public String toString() {
        return "\n Nuestros integrantes son: \n" + 
                "  padre : " + padre + "\n " +
        		" madre : " + madre + 
                "\n hijos : " + "\n " + Arrays.toString(hijos) +
                "\n tios : " + "\n " + Arrays.toString(tios) +
                "\n abuelas :  " + "\n " + Arrays.toString(abuelas) +
                "\n abuelos :  " + "\n " + Arrays.toString(abuelos);
    }
}
