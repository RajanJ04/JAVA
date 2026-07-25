package Loops;
import java.util.*;
public class dowhile {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if(n % 10 ==0){
                continue;
            }
            System.out.println("You entered: " + n);
        }while(true);
    }
}
