package ferroviaria.maquinaria;

/**
 * @author: Raquel Fernández Melgares
 */

import ferroviaria.maquinaria.Mercancía;
import ferroviaria.maquinaria.Vagón;
import ferroviaria.personal.Maquinista;
import ferroviaria.maquinaria.Locomotora;
import java.util.ArrayList;
import java.util.Scanner;

public class Tren {

    static Scanner sc = new Scanner(System.in);

    private static int numTrenes = 0;
    Maquinista maquinista;
    Locomotora locomotora;
    ArrayList<Vagón> vagones = new ArrayList<Vagón>();


    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
        this.numTrenes++;
    }

    public int recogerCargaMaxima() {
        int cargaMax = sc.nextInt();
        return cargaMax;
    }

    private Mercancía recogerTipoMercancia() {
        int mercancía = sc.nextInt();
        Mercancía merc;
        switch (mercancía) {
            case 1 -> merc = Mercancía.PERECEDERA;
            case 2 -> merc = Mercancía.NOPERECEDERA;
            case 3 -> merc = Mercancía.FRÁGIL;
            case 4 -> merc = Mercancía.PELIGROSA;
            default -> merc = Mercancía.DIMENSIONAL;
        }
        return merc;
    }

    public void AñadirVagón() {
        if (Vagón.getContador() >= 5) {
            System.out.println("No se puede añadir más vagones al tren");
        } else {
            System.out.println("Creando vagón...");
            System.out.println("¿Cuál es la carga máxima?");
            int cargaMax = this.recogerCargaMaxima();
            System.out.println("¿Qué tipo de mercancía lleva?");
            Mercancía tipoMercancia = this.recogerTipoMercancia();
            System.out.println("Identificador:");
            int id = this.numTrenes + this.vagones.size();
            System.out.println(id);
            Vagón últimoVagón = new Vagón(id, cargaMax, 0);
            this.vagones.add(últimoVagón);
        }
    }

    public void GetVagones() {
        System.out.println(vagones.size());
    }

    public void QuitarVagón() {
        vagones.remove(this.vagones.size() -1);
    }

    public void mostrarContador() {
        System.out.println(numTrenes++ + " trenes");
    }


    @Override
    public String toString() {
        return "Tren{" +
                "maquinista=" + maquinista +
                ", locomotora=" + locomotora +
                ", vagones=" + vagones +
                '}';
    }

    public void imprimirDatos() {
        System.out.println(toString());
    }


}
