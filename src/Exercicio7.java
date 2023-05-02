import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner resulto = new Scanner(System.in);
        double valorCotacão;
        double QuantidadeDolar;

        System.out.println("Digite a cotação do dolar: ");
        valorCotacão = resulto.nextDouble();

        System.out.println("Digite quantos você tem em dolar: ");
       QuantidadeDolar = resulto.nextDouble();

       double valor =QuantidadeDolar * valorCotacão;

       valorReal(valor);
    }
    public static double valorReal(double valor) {
        System.out.println("Você tem "+valor+" em real.");

        return valor;
    }
}
