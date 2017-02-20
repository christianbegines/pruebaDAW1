package saludo;

import java.util.Arrays;
import java.util.Scanner;

public class StringPruebas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nombre = {"cristian", "pepe", "juan", "gary", "kevin", "ernesto"};

        String[] apellido = {"bello", "mencia", "garcia", "sanchez", "bello", "garcia"};

        String apellido2 = "holis";

        int pos;
        for (int i = 0; i < nombre.length; i++) {
            System.out.println(nombre[i] + " " + apellido[i]);

        }

        System.out.println("");

        System.out.println("Introduce un apellido para buscarlo: ");

        apellido2 = sc.next();

        pos = Arrays.binarySearch(apellido, apellido2.toLowerCase());

        if (pos >= 0) {
            System.out.println(nombre[pos] + " " + apellido[pos]);

        } else {
            System.out.println("no se encuentra");

        }

    }

}
