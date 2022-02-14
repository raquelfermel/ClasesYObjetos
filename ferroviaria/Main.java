package ferroviaria;

import ferroviaria.maquinaria.Locomotora;
import ferroviaria.maquinaria.Tren;
import ferroviaria.personal.JefeDeEstación;
import ferroviaria.personal.Maquinista;
import ferroviaria.personal.Mecánico;

/**
 * @author: Raquel Fernández Melgares
 */

public class Main {
    public static void main(String[] args) {

        // imprimimos los datos de los dos maquinistas
        Maquinista maquinista1 = new Maquinista("Juan", "04982236T", 1760.93, "Jefe");
        Maquinista maquinista2 = new Maquinista("José", "44587710R", 1387.20, "Jefe");

        System.out.println("Datos del primer maquinista:");
        maquinista1.mostrarDatos();

        System.out.println("\nDatos del segundo maquinista:");
        maquinista2.mostrarDatos();

        // un mecánico de cada especialidad
        Mecánico mecánico1 = new Mecánico("Alfredo", "912378433", "Frenos");
        Mecánico mecánico2 = new Mecánico("Ricardo", "912239675", "Hidráulica");
        Mecánico mecánico3 = new Mecánico("Carmen", "916638994", "Electricidad");
        Mecánico mecánico4 = new Mecánico("Sandra", "917449226", "Motor");

        // imprimimos los datos de cada mecánico
        System.out.println("\n**************************");
        System.out.println("Datos del primer mecánico:");
        mecánico1.mostrarDatos();

        System.out.println("\nDatos del segundo mecánico:");
        mecánico2.mostrarDatos();

        System.out.println("\nDatos del tercer mecánico:");
        mecánico3.mostrarDatos();

        System.out.println("\nDatos del cuarto mecánico:");
       mecánico4.mostrarDatos();

        // Un jefe de estación
        JefeDeEstación jefe = new JefeDeEstación("Gerardo", "06773825P", "21/5/2005");
        // Imprimimos los datos del jefe de estación
        System.out.println("\n***************************");
        System.out.println("Datos del jefe de estación:");
        jefe.mostrarDatos();

        // Una locomotora
        Locomotora loco = new Locomotora("98843GHT", 32, 1972, mecánico2);
        // imprimimos los datos de la locomotora
        System.out.println("\n***************************");
        System.out.println("Datos de la locomotora:");
        loco.imprimirDatos();

        // Creamos un tren con la locomotora que acabamos de crear
        Tren tren = new Tren(loco, maquinista1);
        // Mostramos los datos del tren
        System.out.println("\n***************************");
        System.out.println("Datos del tren:");
        tren.imprimirDatos();

        // Añadimos 6 vagones al tren (nos dirá que el último no se puede)
        System.out.println("\nAñadimos 5 vagones al tren y tratamos de añadir uno más: ");
        System.out.println("***************************");
        for (int i = 0; i < 6; i++) {
            tren.AñadirVagón();
        }
        // Mostramos el número de vagones del tren
        System.out.println("Número de vagones:");
        tren.GetVagones();

        // Quitamos un vagón
        System.out.println("\n***** Quitamos un vagón *****");
        tren.QuitarVagón();
        // mostramos el número de vagones del tren
        System.out.println("Número de vagones:");
        tren.GetVagones();

        //Actualizamos los datos del tren
        System.out.println("\nDatos del tren:");
        tren.imprimirDatos();

        // Finalmente, contamos todos los elementos que tenemos en la estación
        System.out.println("\nMi estación se compone de");
        jefe.mostrarContador();
        loco.mostrarContador();
        maquinista2.mostrarContador();
        mecánico4.mostrarContador();
        tren.mostrarContador();

    }
}
