import java.util.*;

public class arr {
    
    public static void main(String args[]){

        String fruits[] = new String[10];

        Scanner sc = new Scanner (System.in);

        fruits[0] = sc.nextLine();
        fruits[1] = sc.nextLine(); 
        fruits[2] = sc.nextLine();
        fruits[3] = sc.nextLine();

        System.out.println("0th element of the array is: " + fruits[0]);
        System.out.println("1st & 2nd fruits are: " + fruits[1] + " and " + fruits[2]);
        System.out.println("All the elements of the array are: " + fruits[0] + ", " + fruits[1] + ", " + fruits[2] + ", " + fruits[3]);
        System.out.println("Length of the array is: " + fruits.length);
        
    
        }
    }