import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner LerTemperatura = new Scanner(System.in);
        double GrauCelsius;

        System.out.println("Digite a temperatura e graus celsius: ");
        GrauCelsius = LerTemperatura.nextDouble();

        double GrauFahrenheit = (9 * GrauCelsius + 160) / 5;

        temperaturaFinal(GrauFahrenheit);
    }
    public static double  temperaturaFinal(double GrauFahrenheit) {
        System.out.println("Temperatura Atual em Fahrenheit: "+GrauFahrenheit);

        return GrauFahrenheit;
    }
}
