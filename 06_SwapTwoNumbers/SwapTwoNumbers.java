import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = input.nextInt();

        System.out.print("Enter second number: ");
        int second = input.nextInt();

        System.out.println("Before swapping: a = " + first + ", b = " + second);

        int temp = first;
        first = second;
        second = temp;

        System.out.println("After swapping: a = " + first + ", b = " + second);

        input.close();
    }
}
