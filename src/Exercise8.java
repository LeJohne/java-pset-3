import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        DecimalFormat deci = new DecimalFormat("0");

        System.out.print("Students : ");
        int Students = in.nextInt();

        System.out.print("Teachers : ");
        int Teachers = in.nextInt();

        System.out.print("Capacity : ");
        int Capacity = in.nextInt();

        int Passengers = Students + Teachers;
        int Buses = Passengers / Capacity;
        int OverFlow = Passengers % Capacity;


        System.out.println("\nBuses required      : " + deci.format(Buses + 1));
        System.out.println("Overflow passengers : " + OverFlow);
    }
}