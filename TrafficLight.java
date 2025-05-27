import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the traffic light color (red, yellow, green): ");
        String color = scanner.nextLine().toLowerCase(); 

        switch (color) {
            case "red":
                System.out.println("Stop");
                break;

            case "yellow":
                System.out.println("Get Ready");
                break;

            case "green":
                System.out.println("Go");
                break;

            default:
                System.out.println("Invalid color. Please enter red, yellow, or green.");
        }

        scanner.close();
    }
}
