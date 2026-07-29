import java.util.*;
public class add {

    public static void addition(int a, int b){
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);

        public static void hi(){
            System.out.println("Hello");
            return 0;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        addition(num1, num2);
    }
    
}
