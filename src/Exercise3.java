import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("#,###,###.##");
        final double conversion = 25.4;
        System.out.print("Height : ");
        float Height = in.nextFloat();
        System.out.print("Width  : ");
        float Width = in.nextFloat();

        double Heightmm = Height * conversion;
        double Widthmm = Width * conversion;
        double result = Heightmm * Widthmm;

        System.out.println( deci.format(result) + " square millimeters.");
    }
}
