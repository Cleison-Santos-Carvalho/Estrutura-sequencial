import java.util.Locale;

public class UsandoVariasConcatenacao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double x = 10.35784;

        System.out.printf("RESULTADO = %.2f metros%n", x);
    }
}