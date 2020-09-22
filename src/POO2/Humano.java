package POO2;

public abstract class Humano {
	
	private String nombre;
    private String apellido;
    private int edad;

    public Humano(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public abstract String getGenero();
    
    public abstract void ejecutarAccion();

    public abstract boolean esAdulto();

    @Override
    public String toString() {
     
    	return  "  nombre = " + nombre + "  apellido = " + apellido +  "  edad = " + edad;
    	
    	
    }
    
    
    
}
