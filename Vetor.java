/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetor;

import java.util.Scanner;


/**
 *
 * @author samsung
 */
public class Vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v [] = new int [10];
        for (int i = 0; i< v.length; i++){
            System.out.println("Digite o num: ");
            v[i]= input.nextInt();
           
       } for(int i =0 ; i<v.length; i++){
            System.out.print(v[i]+" ");
       }    System.out.print("********** ");
        for(int i = v.length-1; i>=0; i--){
            
            System.out.print(v[i]+" ");
    }    
  }  
}
