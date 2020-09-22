package Familia;

import java.util.Arrays;

import POO.Adolescente;
import POO.Adulto;
import POO.Niño;
import POO2.Humano;

public class FamiliaMartinez implements Familia {

    private final Adulto padre = new Adulto("Pablo", "Martinez", 43);
    private final Adulto madre = new Adulto("Ariela", "Martinez", 42);
    private final Humano[] hijos = { new Niño("Pedrito", "Martinez ", 8), (Humano) new Adolescente("Juan", "Martinez", 20) };
    private final Adulto[] tios = { new Adulto("Kihs", "Martinez", 40), new Adulto("Firulats", "Martinez", 50) };
    private final Adulto[] abuelas = { new Adulto("Marisa", "Martinez", 89), new Adulto("Teresa", "Martinez", 92) };
    private final Adulto[] abuelos = { new Adulto("Pablo", "Martinez", 90), new Adulto("Juan", "Martinez", 85) };

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
        System.out.println("La Familia Martinez Siempre esta Peleando \n " + toString());
    }

    @Override
    public String toString() {
        return "\n Nuestros integrantes son:  \n" +
        		"  padre : " + padre + "\n " +
        		" madre : " + madre + 
                "\n hijos : " + "\n " + Arrays.toString(hijos) +
                "\n tios : " + "\n " + Arrays.toString(tios) +
                "\n abuelas :  " + "\n " + Arrays.toString(abuelas) +
                "\n abuelos :  " + "\n " + Arrays.toString(abuelos);
    
    }

}
