import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        DecimalFormat deci = new DecimalFormat("###,###,###,###.00");

        System.out.print("Salary  : ");
        double Salary = in.nextDouble();

        System.out.print("401(k)  : ");
        double FourOOneK = in.nextDouble();

        System.out.print("Federal : ");
        double Federal = in.nextDouble();

        System.out.print("State   : ");
        double State = in.nextDouble();

        double FourOOneK2 = FourOOneK/100;
        double Federal2 = Federal/100;
        double State2 = State/100;
        double Salary2 = Salary - (Salary * FourOOneK2);
        double FSalary = Salary2 - (Salary2 * (Federal2 + State2));
        double Pay = FSalary/24;

        System.out.println("\n$" + deci.format(Pay) + ".");
    }
}