/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotterygame;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class LotteryGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner input = new Scanner(System.in);
        
        
        int randomNumber1 = (int) (Math.random() * 10);
        int randomNumber2 = (int) (Math.random() * 10); 
        
        System.out.println("Please enter the Golden numbers");
        
        int Golden1, Golden2;
        
        System.out.println("Please enter the Golden number1");
        Golden1 = input.nextInt();
        
        System.out.println("Please enter the Golden number2");
        Golden2 = input.nextInt();
        
        if ( Golden1 == randomNumber1 && Golden2 == randomNumber2) 
        { System.out.println("Congratulations, you have won 10000$");
        } else if (Golden1 == randomNumber2 && Golden2 == randomNumber1) 
        { System.out.println("Congratulations, you have won 3000$");
        }else if (Golden1 == randomNumber1 || Golden2 == randomNumber2) 
        { System.out.println("Congratulations, you have won 1000$");
        } else{ System.out.println("Sorry, You have won nothing, Try again.");
}
        {System.out.println("The Golden number is" + randomNumber1 + "" + randomNumber2);
    
    }
}}


