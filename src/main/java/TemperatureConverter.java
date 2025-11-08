import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.println("--- Temperature Converter ---");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("Choose an option (1 or 2): ");
        int choice = in.nextInt();

        if (choice == 1) {
            System.out.print("Enter the temperature in Celsius: ");
            double celsius = in.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println(celsius + "°C = " + fahrenheit + "°F");
        } else if (choice == 2) {
            System.out.print("Enter the temperature in Fahrenheit: ");
            double fahrenheit = in.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + "°F = " + celsius + "°C");
        } else {
            System.out.println("Invalid choice. Please select 1 or 2.");
        }
        in.close();
    }
}
