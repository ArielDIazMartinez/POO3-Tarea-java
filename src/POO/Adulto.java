package POO;

import POO2.Hombre;

public class Adulto extends Hombre {

    public Adulto(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    @Override
    public void ejecutarAccion() {
    }

    @Override
    public boolean esNiño() {
        return false;
    }

    @Override
    public boolean esAdolescente() {
        return false;
    }

    @Override
    public boolean esAdulto() {
        return true;
    }

}
