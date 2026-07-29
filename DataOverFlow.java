public class DataOverFlow {
    public static void main(String[] args) {

        byte num = 127;

        System.out.println("Before Overflow: " + num);

        num++; // Causes overflow

        System.out.println("After Overflow: " + num);
    }
}