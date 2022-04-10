/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num1, num2, soma,sub, multi, div;
        String resp;
        
        System.out.println("*************************************");
        System.out.println("           *CALCULADORA*             ");
        System.out.println("*************************************");
        System.out.println("             DIGITE                  ");
        System.out.println("+ para somar");
        System.out.println("- para subtrair");
        System.out.println("* para multiplicar");
        System.out.println("/ para dividir");
        System.out.println("\n          DIGITE A OPÇÃO           ");
        
        Scanner entrada = new Scanner(System.in);
        resp = entrada.nextLine();
        if ("-".equals(resp)){
            System.out.println("Digite 1 num com ponto: ");
            num1 = entrada.nextFloat();
            System.out.println("Digite 1 num com ponto: ");
            num2 = entrada.nextFloat();
            sub = num1 - num2 ;
            System.out.println("SUBTRAÇÃO: "+ sub );
            
        }
        else if ("+".equals(resp)){
            System.out.println("Digite 1 num com ponto: ");
            num1 = entrada.nextFloat();
            System.out.println("Digite 1 num com ponto: ");
            num2 = entrada.nextFloat();
            soma = num1 + num2 ;
            System.out.println("SOMA: "+ soma );
        
    } 
        else if ("*".equals(resp)){
            System.out.println("Digite 1 num com ponto: ");
            num1 = entrada.nextFloat();
            System.out.println("Digite 1 num com ponto: ");
            num2 = entrada.nextFloat();
            multi = num1 * num2 ;
            System.out.println("MULTIPLICAÇÃO: "+ multi );
    
        }
        else if ("/".equals(resp)){
            System.out.println("Digite 1 num com ponto: ");
            num1 = entrada.nextFloat();
            System.out.println("Digite 1 num com ponto: ");
            num2 = entrada.nextFloat();
            div = num1 / num2 ;
            System.out.println("DIVISÃO: "+ div );
    }
  }
}
    
