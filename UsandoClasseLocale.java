import java.util.Locale;

public class UsandoClasseLocale {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double x = 10.35784;
        
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

    }
}