import java.util.Scanner;

public class advfo {

    // Add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two double values
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Add Two Integers");
        System.out.println("2. Add Three Integers");
        System.out.println("3. Add Two Decimal Numbers");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter first number: ");
                int a = sc.nextInt();

                System.out.print("Enter second number: ");
                int b = sc.nextInt();

                System.out.println("Sum = " + add(a, b));
                break;

            case 2:
                System.out.print("Enter first number: ");
                int x = sc.nextInt();

                System.out.print("Enter second number: ");
                int y = sc.nextInt();

                System.out.print("Enter third number: ");
                int z = sc.nextInt();

                System.out.println("Sum = " + add(x, y, z));
                break;

            case 3:
                System.out.print("Enter first decimal number: ");
                double d1 = sc.nextDouble();

                System.out.print("Enter second decimal number: ");
                double d2 = sc.nextDouble();

                System.out.println("Sum = " + add(d1, d2));
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}