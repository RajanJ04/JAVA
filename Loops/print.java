//PRINT NUMBERS FROM 1 TO N

import java.util.*;
public class print {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        while(counter <= n){
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
    }
}
