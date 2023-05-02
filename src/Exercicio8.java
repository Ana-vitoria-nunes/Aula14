import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner lervalor = new Scanner(System.in);
        double valorproduto;
        double porcentagem;

        System.out.println("Qual o valor do produto: ");
        valorproduto = lervalor.nextDouble();

        System.out.println("Quantos porcento você deseja lucrar: ");
        porcentagem = lervalor.nextDouble();

        double conta= (porcentagem*valorproduto)/100;
        double valorVenda=valorproduto+conta;

        ValorFinal(valorVenda);
    }
    public static double ValorFinal(double valorVenda) {
        System.out.println("O valor final do seu produto è: "+valorVenda);

        return valorVenda;
    }
}
