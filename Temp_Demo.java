import java.util.Scanner;

/**
 * This program demonstrates the Temperature class. 
 */
public class Temp_Demo
{
   public static void main(String[] args)
   {
	  double usertemp;
      double answer;
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter in a Fahrenheit temperature: ");
     
      usertemp = keyboard.nextDouble();
      
      Temperature temp = new Temperature(usertemp);
      
      System.out.println("Fahrenheit " + temp.getFahrenheit());
      System.out.println("Celsius " + temp.getCelsius());
      System.out.println("Kelvin " + temp.getKelvin());
   }     
}