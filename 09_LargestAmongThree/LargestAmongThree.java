import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = input.nextDouble();

        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        System.out.print("Enter third number: ");
        double third = input.nextDouble();

        if (first >= second && first >= third) {
            System.out.println("Largest number is: " + first);
        } else if (second >= first && second >= third) {
            System.out.println("Largest number is: " + second);
        } else {
            System.out.println("Largest number is: " + third);
        }

        input.close();
    }
}
