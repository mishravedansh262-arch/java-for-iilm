import java.util.Scanner;

public class MultiplyFloatingPointNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first floating-point number: ");
        double first = input.nextDouble();

        System.out.print("Enter second floating-point number: ");
        double second = input.nextDouble();

        double product = first * second;
        System.out.println("Product = " + product);

        input.close();
    }
}
