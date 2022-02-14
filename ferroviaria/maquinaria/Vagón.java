package ferroviaria.maquinaria;

/**
 * @author: Raquel Fernández Melgares
 */

public class Vagón {
    int id;
    int cargaMáxima;
    int cargaActual;
    private static int contador = 0;

    public Vagón(int id, int cargaMáxima, int cargaActual) {
        this.id = id;
        this.cargaMáxima = cargaMáxima;
        this.cargaActual = cargaActual;
        this.contador += 1;
    }

    public static int getContador() {
        return contador;
    }

    @Override
    public String toString() {
        return "Vagón{" +
                "id=" + id +
                ", cargaMáxima=" + cargaMáxima +
                ", cargaActual=" + cargaActual +
                '}';
    }

    public void mostrarDatos() {
        System.out.println(toString());
    }
}
