import java.util.Scanner;
public class binocof {
    public static int factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f * i;
        }
        return f;
    }
    public static int binomialCoefficient(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_r = factorial(n - r);
        int binomialCoefficient = fact_n / (fact_r * fact_n_r);
        return binomialCoefficient;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();
        int result = binomialCoefficient(n, r);
        System.out.println("The binomial coefficient C(" + n + ", " + r + ") is: " + result);
    }
}
