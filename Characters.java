/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Characters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a charater to find its ASCII code");
        char value = input.next().charAt(0);
        
        System.out.println("The character code in ASCII is " + (int)value); 

    
    
    
    
    
    }
    
}
