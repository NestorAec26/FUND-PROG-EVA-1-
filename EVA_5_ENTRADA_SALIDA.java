/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_5_entrada_salida;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA_5_ENTRADA_SALIDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String apellido;
        int semestre;
        Scanner capturota = new Scanner(System.in); 
   
        System.out.println("Introduce tu nombre");
        nombre = capturota.nextLine();
        System.out.println("Introduce tu apellido");
        apellido = capturota.nextLine();
         System.out.println("Introduce tu semestre");
        apellido = capturota.nextLine();
        
        
        System.out.println("nombre");
        System.out.println("apellidos");
        System.out.println("semestre");
    }
    
}
