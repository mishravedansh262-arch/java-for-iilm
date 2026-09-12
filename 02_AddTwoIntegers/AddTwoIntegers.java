import java.util.Scanner;

public class AddTwoIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int first = input.nextInt();

        System.out.print("Enter second integer: ");
        int second = input.nextInt();

        int sum = first + second;
        System.out.println("Sum = " + sum);

        input.close();
    }
}
