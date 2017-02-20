/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saludo;

import java.util.Scanner;

/**
 *
 * @author daw
 */
public class SandraJose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la edad: ");
        int edad = sc.nextInt();
        System.out.print("¿Tienes socios?: ");
        String socios = sc.next();

        double cuota = 30;

        if (edad > 65 && socios.equalsIgnoreCase("Si")) {
            cuota = cuota * 1.15;
            System.out.print("La cuota es de: " + cuota);
        }

        if (edad > 65 && socios.equalsIgnoreCase("No")) {
            cuota = cuota * 1.3;
            System.out.print("La cuota es de" + cuota);
        }

        if (edad <= 65 && socios.equalsIgnoreCase("Si")) {
            cuota = cuota / 1.15;
            System.out.print("La cuota es de: " + cuota);
        }

        if (edad <= 65 && socios.equalsIgnoreCase("No")) {
            cuota = cuota;
            System.out.print("La cuota es de: " + cuota);

        }

    }

}
