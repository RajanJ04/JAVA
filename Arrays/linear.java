package Arrays;
import java.util.*;
public class linear {

    public static int linearsearch(int marks[], int key){

        for(int i = 0; i<marks.length; i++){
            if(marks[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int marks[] = {50, 67, 97, 56, 87};
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();
        
        int index = linearsearch(marks, key);
        if(index == -1){
            System.out.println("The key is not in the  array");
        } else{
            System.out.println("The key is present at index: " + index);
        }
    }
    
}
