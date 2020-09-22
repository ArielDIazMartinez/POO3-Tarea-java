package POO2;

public abstract class Hombre extends Humano {

    public Hombre(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    @Override
    public String getGenero() {
        return "Hombre";
    }

    public abstract boolean esNiño();

    public abstract boolean esAdolescente();
    
    public abstract boolean esAdulto();

   

}
