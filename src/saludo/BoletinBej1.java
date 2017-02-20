/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saludo;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author daw
 */
public class BoletinBej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat mi_formato = new DecimalFormat("00.00"); //MOSTAR 2 DECIMALES
        Scanner tec = new Scanner(System.in);
        final double SUELDOBASE = 1000;
        final double HIJO = 10 / 100.0;
        final double ALIM = 10;
        final double SSOC = 0.02;
        int hijos=0;
        double sueldo = SUELDOBASE, bonoHijos = 0, alimentacion, ssocial;
        int dias;
        do {
            try{
            System.out.println("¿Cuántos hijos tiene? (0/1/2/…)");
            hijos = tec.nextInt();
            } catch(Exception e){
                tec.next();
                System.out.println("Error de introduccion");
                hijos=-1;
            }
        } while (hijos < 0);
        System.out.println("Indica numero de dias trabajados:");
        dias = tec.nextInt();

        if (hijos > 0) {
            bonoHijos = hijos * (HIJO * sueldo);
            //APLICA FORMATO
            System.out.println("Por bono de hijos: " + mi_formato.format(bonoHijos));
        }

        alimentacion = ALIM * dias;
        System.out.println("Por bono de alimentación: " + alimentacion);
        ssocial = sueldo * SSOC;
        System.out.println("Por dto de seguridad social es: " + mi_formato.format(ssocial));
        sueldo = sueldo + bonoHijos + alimentacion - ssocial;
        System.out.println("SUELDO FINAL es de " + sueldo + "€");
    }

}
