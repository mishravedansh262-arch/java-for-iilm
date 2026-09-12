import java.util.Scanner;

public class ASCIIValueOfCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        int ascii = (int) ch;
        System.out.println("ASCII value of '" + ch + "' is: " + ascii);

        input.close();
    }
}
