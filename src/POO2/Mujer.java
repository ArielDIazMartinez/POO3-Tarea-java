package POO2;

public abstract class Mujer extends Humano {

    public Mujer(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    @Override
    public String getGenero() {
        return "Mujer";
    }

    public abstract boolean esNiña();

    public abstract boolean esAdolescente();

    public abstract boolean esAdulta();

}
