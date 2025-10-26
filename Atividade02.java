import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit, kelvin;

        System.out.print("Digite a temperatura em Celsius (°C): ");
        celsius = input.nextDouble();

        // Conversões
        fahrenheit = (celsius * 9 / 5) + 32;
        kelvin = celsius + 273.15;

        // Exibição dos resultados
        System.out.println("\n--- Conversão de Temperatura ---");
        System.out.println("Temperatura em Celsius: " + celsius + " °C");
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Temperatura em Kelvin: " + kelvin + " K");

        input.close();
    }
}