import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        System.out.print("Olá, Mundo!\n");
        System.out.println("Bom dia!");

        int y = 32;

        System.out.println(y);

        double x = 10.35784;

        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("x = %.2f%n", x);

        double result = x + y;
        System.out.println("Resultado = " + result + " metros");

        System.out.printf("Resultado = %.2f metros%n", x);

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);

    }
}