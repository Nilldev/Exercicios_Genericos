/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio102;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class Exercicio102 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num;
        System.out.println("\nDIGITE UM NÚMERO:");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        if ( num > 20){
        System.out.println("NÚMERO MAIOR DO QUE 20");
    }   else if(num==20){
            System.out.println("NÚMERO IGUAL A  20");
    }
    else {
            System.out.println("NÚMERO MENOR DO QUE 20");
    }
  
  }    
           
}
    

