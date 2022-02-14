package ferroviaria.personal;

/**
 * @author: Raquel Fernández Melgares
 */

public class Mecánico {
    private String nombre;
    private String telefono;
    private String especialidad;
    private Mecánico mecánico;
    private static int numMecánicos = 0;

    public Mecánico(String nombre, String telefono, String especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.numMecánicos++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void mostrarContador() {
        System.out.println(numMecánicos++ + " mecánicos");
    }

    @Override
    public String toString() {
        return "Mecánico{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }

    public void mostrarDatos() {
        System.out.println(toString());
    }
}
