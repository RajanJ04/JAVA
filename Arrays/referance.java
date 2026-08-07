package Arrays;
//import java.util.*;
public class referance {

    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){
        
        int marks[]= {89, 99, 199, 299, 399};
        System.out.println("The marks before updating are: " + marks[0] + " " + marks[1] + " " + marks[2] + " " + marks[3] + " " + marks[4]);
        update(marks);
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");  
        }
    }
} 
