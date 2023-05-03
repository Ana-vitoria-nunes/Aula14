public class Exercicio5 {
    public static void main(String[] args) {
        String nome="Ana";
        double salario=1200;
        double vendas= 100;
        double comissao=(15*vendas)/100;

        double salarioFinal=salario+comissao;

        System.out.println("Nome: "+nome);
        System.out.println("Salário: "+salario);

        valorVendas(salarioFinal);
    }
    public static double valorVendas (double salarioFinal) {
        System.out.println("Salário com o adicional da comissão: "+salarioFinal);

        return salarioFinal;
    }
}
