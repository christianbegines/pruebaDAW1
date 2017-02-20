/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saludo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Bisiestos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año1, año2, num_dias = 0;
        String mes;

        System.out.println("Año1:");
        año1 = sc.nextInt();
        System.out.println("Año2:");
        año2 = sc.nextInt();

        if (año1 < año2) {
            System.out.println(listaBisiestos(año1, año2));
        } else {
            System.out.println("Años no consecutivos");
        }
    }

    public static boolean bisiesto(int año) {
        boolean respuesta;

        if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
            respuesta = true;
        } else {
            respuesta = false;
        }
        return respuesta;
    }
    
    public static List<Integer> listaBisiestos(int año1, int año2){
        List<Integer> lista= new ArrayList<>();
        
         for (int año = año1; año <= año2; año++) {
                if (bisiesto(año)) {
                   lista.add(año);
                }
            }
         return lista;
    }
}
