package Patterns;

public class invertednos {

    public static void invertedNosTrg(int nos){

        for(int i = 1; i<=nos ; i++){

            for(int j = 1; j<=nos-i+1; j++)
            {
                System.out.print(j+" ");
            }
             System.out.println();
        }
        //System.out.println();
    }
    public static void main(String[] args) {

        invertedNosTrg(5);
        
    }
    
}
