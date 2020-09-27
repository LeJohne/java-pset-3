import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Amount : ");
        double Amount = in.nextDouble();

        Amount = Amount * 100;

        int Quarters = (int) Amount / 25;
        int Remaining = (int) (Amount % 25);

        int Dimes = Remaining / 10;
        int Remaining1 = (Remaining % 10);

        int Nickels = Remaining1 / 5;
        int Remaining2 = (Remaining1 % 5);

        int Pennies = Remaining2 / 1;

        System.out.println("\nQuarters : " + Quarters);
        System.out.println("Dimes    : " + Dimes);
        System.out.println("Nickels  : " + Nickels);
        System.out.println("Pennies  : " + Pennies);
    }
}