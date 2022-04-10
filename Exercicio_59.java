/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_59;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class Exercicio_59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Entre com o cateto 1: ");
        double a = tec.nextDouble();
        System.out.println("Entre com o cateto 2: ");
        double b = tec.nextDouble();
        System.out.printf("A hipotenusa é: %.1f ", (Math.sqrt(Math.pow(a,2)+Math.pow(b,2))));
        
        
        
        
    }
    
}
