/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediacomposta;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class MediaComposta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o ano de seu nascimento: ");
        int nasc = tec.nextInt();
        int id = 2021-nasc;
        if (id >=18){
            System.out.println("MAIOR DE IDADE");
        }
        else{
            System.out.println("MENOR DE IDADE");
        }
        // TODO code application logic here
    }
    
}
