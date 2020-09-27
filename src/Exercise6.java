import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        DecimalFormat deci = new DecimalFormat("###,###,###,###.00");

        System.out.print("Wage      : ");
        double Wage = in.nextDouble();

        System.out.print("Monday    : ");
        double Mon = in.nextDouble();

        System.out.print("Tuesday   : ");
        double Tue = in.nextDouble();

        System.out.print("Wednesday : ");
        double Wed = in.nextDouble();

        System.out.print("Thursday  : ");
        double Thur = in.nextDouble();

        System.out.print("Friday    : ");
        double Fri = in.nextDouble();

        System.out.print("Saturday  : ");
        double Sat = in.nextDouble();

        System.out.print("Sunday    : ");
        double Sun = in.nextDouble();


        double Hours = Mon + Tue + Wed + Thur + Fri + Sat + Sun;
        double Pay = Hours * Wage;

        System.out.println("\n$" + deci.format(Pay) + ".");
    }
}