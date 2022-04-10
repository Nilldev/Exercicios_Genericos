/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class Fibonacci {
    
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Digite um número inteiro: ");
         int n;
         int num1 = 0;
         int num2 = 1;
         n = input.nextInt();
         
         int soma = num1 + num2;
         switch (n){
             case 1:
                 System.out.println(num1);
                 break;
             case 2:
                 System.out.println(num2);
                 break;
             case 3:
                 System.out.println(soma);
                 break;
             default:
                 for (int i=3; i<=n; i++){
                     num1 = num2;
                     num2 = soma;
                     soma = num1 + num2;
                 }
                 
                 System.out.println(soma);
             
         }
         
         
                 
       
        
        
    
        }
    }
