import java.util.Scanner;  
public class JavaExample{  
  
    //user-defined function  
    public static int fact_with_while(int n){  
        int fact = 1;  
        int i = 1;  
  
        while( i <= n ) {  
            fact = fact * i;   
            i++;   
        }  
  
        //returning result to main()  
        return fact;
  
    }  
public static void main(String[] args) {  
          
        Scanner sc = new Scanner(System.in);  
  
        //accepting a number from the user  
        System.out.println("Enter a number whose factorial is to be found: ");  
int num = sc.nextInt();  
          
        //printing the result  
        System.out.println("\nFactorial of " + num + " is: " + fact_with_while(num));  
    }  
}  