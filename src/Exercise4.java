import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("#,###,###.##");
        final double conversion = 2.54;
        System.out.print("Height : ");
        float Height = in.nextFloat();
        System.out.print("Width  : ");
        float Width = in.nextFloat();

        double Heightcm = Height * conversion;
        double Widthcm = Width * conversion;
        double result = (2* Heightcm) + (2 * Widthcm);

        System.out.println( deci.format(result) + " centimeters.");
    }
}
