package comutingareaoftrinlge;

import java.util.Scanner;

public class Comutingareaoftrinlge {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        double x1, x2, x3, y1, y2, y3;

        System.out.println("Give me the value of x1");
        x1 = input.nextDouble();
        System.out.println("Give me the value of x2");
        x2 = input.nextDouble();
        System.out.println("Give me the value of x3");
        x3 = input.nextDouble();
        System.out.println("Give me the value of y1");
        y1 = input.nextDouble();
        System.out.println("Give me the value of y2");
        y2 = input.nextDouble();
        System.out.println("Give me the value of y3");
        y3 = input.nextDouble();

        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double c = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        System.out.println(" The side a is  " + a);
        System.out.println(" The side b is  " + b);
        System.out.println(" The side c is  " + c);

        double angleA, angleB, angleC;
        angleA = Math.toDegrees((Math.acos((b * b + c * c - a * a) / (2 * b * c))));
        angleB = Math.toDegrees((Math.acos((a * a + c * c - b * b) / (2 * a * c))));
        angleC = Math.toDegrees((Math.acos((b * b + a * a - c * c) / (2 * b * a))));
        System.out.println("The angle of A is ==>  " + Math.ceil(angleA));
        System.out.println("The angle of B is ==>  " + Math.ceil(angleB));
        System.out.println("The angle of C is ==>  " + (Math.ceil(angleC)));
        
        
    }
    
}
