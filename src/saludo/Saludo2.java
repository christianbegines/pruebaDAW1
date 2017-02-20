package saludo;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Saludo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayDeque<String> frases1 = new ArrayDeque<>();

        ArrayDeque<String> frases2 = new ArrayDeque<>();

        int contador = 0;

        int contador1 = 0;

        String texto = "El precio es 20 euros";

        StringTokenizer s = new StringTokenizer(texto, " ");

        while (s.hasMoreTokens() == true) {

            frases1.addFirst(s.nextToken());

            contador++;

        }

        System.out.println("Separado por trozos(StringTokenizer): ");

        System.out.println(frases1);

        System.out.println(" Hay " + contador + " trozos ");

        String[] trozos = texto.split("");

        for (String t : trozos) {

            frases2.addFirst(t);

            contador1++;

        }

        System.out.println("Separado por letras(Split): ");

        System.out.println(frases2);

        System.out.println(" Hay " + contador1 + " letras ");

    }



}
