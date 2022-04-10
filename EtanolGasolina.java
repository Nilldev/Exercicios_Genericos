/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class EtanolGasolina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        Scanner tec = new Scanner(System.in);
        float valorEtanol, valorGasolina, calc;
        
        System.out.println("Digite o valor do Etanol: ");
        valorEtanol = tec.nextFloat();
        
        System.out.println("Digite o valor da Gasolina: ");
        valorGasolina = tec.nextFloat();
        
        calc = valorEtanol/valorGasolina;
        
        if (calc <=0.7){
            System.out.println("O etanol é a melhor opção.");
            
        }else {System.out.println("A gasolina é a melhor opção.");
        
        
        }
    }
}
        
   
     
     
    
       
      
      
       
       
    
    

