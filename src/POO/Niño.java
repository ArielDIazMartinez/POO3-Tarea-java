package POO;

import POO2.Hombre;

public class Niño extends Hombre {

    public Niño(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }
    
   


	@Override
    public void ejecutarAccion() {
    
    }

    @Override
    public boolean esNiño() {
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