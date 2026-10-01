package Patterns;

public class butterfly {
    public static void butter(int n)
    {
       
        // FOR FIRST HALF
        for(int i=1; i<=n; i++)
        {
            //for stars i
            for(int j = 1; j<=i; j++){

                System.out.print("*");
            }
            //for spaces i
            for(int j = 1; j<=2*(n-i); j++){

                System.out.print(" ");
            }

            //for stars i
            for(int j = 1; j<=i; j++){

                System.out.print("*");
            }

            System.out.println();
            
        }

        // FOR SECOND HALF

        for(int i=n; i>=1; i--)
        {
            //for stars i
            for(int j = 1; j<=i; j++){

                System.out.print("*");
            }
            //for spaces i
            for(int j = 1; j<=2*(n-i); j++){

                System.out.print(" ");
            }

            //for stars i
            for(int j = 1; j<=i; j++){

                System.out.print("*");
            }

            System.out.println();
            
        }
    }
   public static void main(String[] args) {
    butter(4);
       
        
    }
}
