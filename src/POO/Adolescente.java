package POO;

import POO2.Hombre;

public class Adolescente extends Hombre{

    public Adolescente(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    
    
  
	@Override
    public void  ejecutarAccion() {
     
    }

    @Override
    public boolean esNiño() {
        return false;
    }

    @Override
    public boolean esAdolescente() {
        return true;
    }

    @Override
    public boolean esAdulto() {
        return false;
    }

}
