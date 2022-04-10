/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaixaEletronico;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class CaixaEletronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite o valor que deseja sacar: ");
        Scanner tec = new Scanner(System.in);
        int valor = tec.nextInt();
        int n50, n20, n10, n5, n2;
        int r50, r20, r10, r5, r2;
        n50 = valor/50;
        r50 = valor%50;
        n20 = r50/20;
        r20 = r50%20;
        n10 = r20/10;
        r10 = r20%10;
        n5 = r10/5;
        r5 = r10%5;
        n2 = r5/2;
        r2 = r5%2;
        System.out.println(n50 +" notas de 50");
        System.out.println(n20 +" notas de 20");
        System.out.println(n10 +" notas de 10");
        System.out.println(n5 +" notas de 5");
        System.out.println(n2 +" notas de 2");
        System.out.println(valor);
        
        
        
        
        
        }
        
         
        
                
        }
        
        
        
        
        // TODO code application logic here
    
    

