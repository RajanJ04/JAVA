package Arrays;

public class largest {
    public static int Getlargest(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
        }
        return largest;
    }
public static void main(String args[]){

        int number[] = {5, 3, 8, 7, 2};
        System.out.println("The largest value in the array is : " + Getlargest(number));
}
}
