public class Temperature
{
   private double fahrenheit; private double celsius; private double kelvin; private double ftemp;
  
   public Temperature(double fahrenheit) {
	   ftemp = fahrenheit;
   }
    
   public void setFahrenheit(double fahrenheit) {
	   ftemp = fahrenheit;
   }
      
   public double getFahrenheit() {
	   return ftemp;
   }
   
   public double getCelsius() {
	   return (5/9) * (ftemp -32);
   }
   
   public double getKelvin() {
	   return ((5/9) * (ftemp -32)) + 273;
   }
}