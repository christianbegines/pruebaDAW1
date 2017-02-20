/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saludo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author daw
 */
public class AlumnosNotaMasBaja {
    public static void main(String[] args) {
        int i, minimo = 0, nota;
        String[] alumnos = {"Juan", "Alberto", "Sandra", "Lorenzo", "Sara", "Laura"};
        int[] notas = new int[alumnos.length];
        String[] igualnota = new String[alumnos.length];

        rellenarNotas(notas);

        System.out.println(Arrays.toString(alumnos));

        for (i = 0; i < notas.length; i++) {
            System.out.printf("%-8d", notas[i]);
        }

        minimo = notaMasBaja(notas);
        System.out.print("\n Nota mínima es " + minimo + " y los alumnos son: "
                + alumnosNotaMasBaja(minimo, notas, alumnos) + "\n");
    }

    public static void rellenarNotas(int[] notas) {
        Random ale = new Random();
        int nota;
        for (int i = 0; i < notas.length;) {
            nota = ale.nextInt(10);
            if (nota > 0) {
                notas[i] = nota;
                i++;
            }
        }
    }

    public static int notaMasBaja(int[] notas) {
        int minimo = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < minimo) {
                minimo = notas[i];
            }
        }
        return minimo;
    }

    public static List<String> alumnosNotaMasBaja(int minimo, int[] notas, String[] alumnos) {
        List<String> alumnosLista = new ArrayList<>();

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == minimo) {
                alumnosLista.add(alumnos[i]);
            }
        }

        return alumnosLista;
    }
}
