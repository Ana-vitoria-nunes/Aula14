public class Execicio1 {
    public static void main(String[] args) {
        NumerodoUsuario(4);
    }
    public static int NumerodoUsuario (int valor) {

        int soma = 0;
        for (int i = 1; i <= valor; ++i) {
            soma = soma + i;
            System.out.println(i);
        }

        System.out.println("Resultado: " + soma);

        return soma;
    }
}