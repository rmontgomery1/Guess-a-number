
package numbers;

import java.util.Scanner;


public class Numbers 
{

    
    public static void main(String[] args) 
    {
        double number=0;
        double placeholder=0;
        double lowest=100;
        double highest=0;
        double average = 0;
        System.out.println("I will tell you the number of your lowest, highest, and averege numbers.");
        Scanner in = new Scanner(System.in);
        for (int x = 0; x <= 9; x++)
            {
            System.out.println("Please enter a number: ");
            number = in.nextInt();  
            while (number>=100 || number<=0)
                {
                System.out.println("Please enter a number between 0 and 100: ");
                        number= in.nextInt();
                }
            
            if (number>=highest){
                highest=number;}
            if (number<=lowest){
                lowest=number;  } 
            
            placeholder=placeholder+number;
            average=placeholder/10; 
        
         }
        
        System.out.println("The lowest number is: " + lowest);
        System.out.println("The highest number is: " + highest);
        System.out.println("The average is: " + average);      
    }
    
}
