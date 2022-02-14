package ferroviaria.personal;

/**
 * @author: Raquel Fernández Melgares
 */

public class JefeDeEstación {

    // todos los atributos del paquete personal deben ser private, y, por tanto, deben llevar getters y setters
    private String nombre;
    private String DNI;
    private String fecha;
    private static int numJefes = 0;

    public JefeDeEstación(String nombre, String DNI, String fecha) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fecha = fecha;
        this.numJefes++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void mostrarContador() {
        System.out.println(numJefes++ + " jefes de estación");
    }

    @Override
    public String toString() {
        return "JefeDeEstación{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }

    public void mostrarDatos() {
        System.out.println(toString());
    }
}
