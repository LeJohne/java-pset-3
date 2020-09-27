import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Fahrenheit : ");
        double Fahr = in.nextFloat();

        double Kel = ((Fahr - 32) * 5/9) + 273.15;
        double Cel = ((Fahr - 32) * 5/9);

        DecimalFormat deci = new DecimalFormat("#,###,##0.00");

        System.out.println("\nCelsius : " + deci.format(Cel));
        System.out.println("Kelvin  : " + deci.format(Kel));
    }
}