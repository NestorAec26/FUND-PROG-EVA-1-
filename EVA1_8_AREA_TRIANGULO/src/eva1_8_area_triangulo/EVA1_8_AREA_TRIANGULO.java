/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_area_triangulo;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_8_AREA_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double altura;
        double base;
        double area;
        Scanner cap = new Scanner (System.in);
        
        System.out.println("introduce la base del Triangulo");
        base = cap.nextDouble();
        System.out.println("Introduce la Altura del Triangulo");
        altura = cap.nextDouble();
        area = (base * altura) / 2;
        System.out.println("El resultado del area:" + area);
        // TODO code application logic here
    }
    
}
