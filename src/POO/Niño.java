package POO;

import POO2.Hombre;

public class Ni�o extends Hombre {

    public Ni�o(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }
    
   


	@Override
    public void ejecutarAccion() {
    
    }

    @Override
    public boolean esNi�o() {
        return true;
    }

    @Override
    public boolean esAdolescente() {
        return false;
    }

    @Override
    public boolean esAdulto() {
        return false;
    }

}