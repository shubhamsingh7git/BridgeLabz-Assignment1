package JavaMethods.Level2;
public class Q6 {
    public static double convertFarhenheitToCelsius(double f){
        return (f-32)*5/9.0;
    }
    public static double convertCelsiusToFarhenheit(double c){
        return (c*9/5.0)+32;
    }
    public static double convertPoundsToKilograms(double p){
        return p*0.453592;
    }
    public static double convertKilogramsToPounds(double kg){
        return kg*2.20462;
    }
    public static double convertGallonsToLiters(double g){
        return g*3.78541;
    }
    public static double convertLitersToGallons(double l){
        return l*0.264172;
    }
    public static void main(String[] args){
        System.out.println("98F = "+convertFarhenheitToCelsius(98)+"C");
        System.out.println("37C = "+convertCelsiusToFarhenheit(37)+"F");
        System.out.println("50 pounds = "+convertPoundsToKilograms(50)+"kg");
        System.out.println("20 kg = "+convertKilogramsToPounds(20)+" pounds");
        System.out.println("10 gallons = "+convertGallonsToLiters(10)+" liters");
        System.out.println("5 liters = "+convertLitersToGallons(5)+" gallons");
    }
}
