package ferroviaria.maquinaria;

import ferroviaria.personal.Mecánico;

/**
 * @author: Raquel Fernández Melgares
 */

public class Locomotora {
    // matrícula
    String matrícula;
    // potencia
    int potencia;
    // añoFabricación
    int añoFabricación;
    // mecánico
    Mecánico mecánico;
    private static int numLocomotoras = 0;

    public Locomotora(String matrícula, int potencia, int añoFabricación, Mecánico mecánico) {
        this.matrícula = matrícula;
        this.potencia = potencia;
        this.añoFabricación = añoFabricación;
        this.mecánico = mecánico;
        this.numLocomotoras++;
    }

    public void mostrarContador() {
        System.out.println(numLocomotoras++ + " locomotora");
    }

    @Override
    public String toString() {
        return "Locomotora{" +
                "matrícula='" + matrícula + '\'' +
                ", potencia=" + potencia +
                ", añoFabricación=" + añoFabricación +
                ", mecánico=" + mecánico +
                '}';
    }

    public void imprimirDatos() {
        System.out.println(toString());
    }

}
