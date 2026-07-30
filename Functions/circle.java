import java.util.Scanner;

public class circle {

    // Area of Circle
    static double circle(double radius) {
        return 3.14 * radius * radius;
    }

    // Circumference of Circle (Overloaded Method)
    static double circle(double radius, int choice) {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.println("Choose an option:");
        System.out.println("1. Area");
        System.out.println("2. Circumference");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Area = " + circle(r));
        } else if (choice == 2) {
            System.out.println("Circumference = " + circle(r, choice));
        } else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}