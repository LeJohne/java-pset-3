import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        DecimalFormat deci = new DecimalFormat("00.00");

        final double Hw_Weight = 0.15;
        final double Quiz_Weight = 0.35;
        final double Test_Weight = 0.50;

        System.out.print("Homework 1 : ");
        float Hw1 = in.nextFloat();

        System.out.print("Homework 2 : ");
        float Hw2 = in.nextFloat();

        System.out.print("Homework 3 : ");
        float Hw3 = in.nextFloat();

        System.out.print("Quiz 1     : ");
        float Quiz1 = in.nextFloat();

        System.out.print("Quiz 2     : ");
        float Quiz2 = in.nextFloat();

        System.out.print("Test 1     : ");
        float Test1 = in.nextFloat();


        double Hw_section = ((Hw1 + Hw2 + Hw3)/3) * Hw_Weight;
        double Quiz_section = ((Quiz1 + Quiz2)/2) * Quiz_Weight;
        double Test_section = Test1 * Test_Weight;
        double result = Hw_section + Quiz_section + Test_section;

        System.out.println("\n" + deci.format(result) + "%.");
    }
}