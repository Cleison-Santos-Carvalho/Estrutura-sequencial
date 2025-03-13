import java.util.Locale;

public class UsandoVariasConcatenacao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double x = 10.35784;

        System.out.printf("RESULTADO = %.2f metros%n", x);

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome, idade, renda);

    }
}