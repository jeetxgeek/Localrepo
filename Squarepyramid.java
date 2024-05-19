

import java.util.Scanner;

/**
 * Innerprogram3
 */
public class Squarepyramid {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int n;int i; int j;
        System.out.println("enter the number for sequence:");
        n = l.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }


    }
    
}