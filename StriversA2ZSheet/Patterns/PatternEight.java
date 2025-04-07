/*
Pattern 8
*********
 *******
  *****
   ***
    *
 */

import java.util.Scanner;
class PatternEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int n = sc.nextInt();

        for(int r=0;r<n;r++){
            //For Starting Spaces
            for(int c1=0;c1<r;c1++){
                System.out.print(" ");
            }
            //For Stars
            for(int c2=0;c2<(((2*n)-1)-(2*r));c2++){
                System.out.print("*");
            }
            //For Ending Spaces
            for(int c3=0;c3<r;c3++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
