public class vechicle {
    String colours;
    int speed;

    public static void main(String[] args) {
        vechicle v1 = new vechicle();

        v1.colours = "Red";
        v1.speed = 120;

        System.out.println("Vehicle colour: " + v1.colours);
        System.out.println("Vehicle speed: " + v1.speed + " km/h");
    }
}
