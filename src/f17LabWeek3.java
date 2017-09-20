
import java.util.Scanner;

public class f17LabWeek3 {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Enter the first number: ");
        double number1 = keyboard.nextDouble();
         
        System.out.printf("Enter the second number: ");
        double number2 = keyboard.nextDouble();
                
        System.out.printf("Enter the third number: ");
        double number3 = keyboard.nextDouble();
        
        System.out.printf("The largest number is: %f ", largestNumber(number1, number2, number3));
        
    }
    
    public static Double largestNumber(double g1, double g2, double g3)
    {
           //return the users' response to the calling method
        
        if (g1 > g2 && g1 > g3)
        return g1;
        if (g2 > g1 && g2 > g3)
        return g2;    
        if (g3 > g1 && g3 > g2)
        return g3;
        return null;
        
    }
}