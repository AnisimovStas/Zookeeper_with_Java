import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the temperature in Celsius from the user
        var temp = scanner.nextDouble();
        // Convert the temperature from Celsius to Fahrenheit
        var celsiusToFahrenheit = temp * 1.8 + 32;
        // Check if the temperature is above or below freezing
        System.out.println(celsiusToFahrenheit >32 ? "Above freezing" :"Below freezing");
    }
}