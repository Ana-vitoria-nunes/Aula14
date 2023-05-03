import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner resultado = new Scanner(System.in);
        double valorCotacão;
        double QuantidadeDolar;

        System.out.println("Digite a cotação do dolar: ");
        valorCotacão = resultado.nextDouble();

        System.out.println("Digite quantos você tem em dolar: ");
       QuantidadeDolar = resultado.nextDouble();

       double valor =QuantidadeDolar * valorCotacão;

       valorReal(valor);
    }
    public static void valorReal(double valor) {
        System.out.println("Você tem "+valor+" em real.");

    }
}
