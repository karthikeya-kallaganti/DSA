/*
Pattern-9
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

 */
import java.util.Scanner;
class PatternNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int n = sc.nextInt();
        for(int r=0;r<n;r++){
            //For starting spaces
            for(int c1=0;c1<n-1-r;c1++){
                System.out.print(" ");
            }
            //For Stars
            for(int c2=0;c2<(2*r)+1;c2++){
                System.out.print("*");
            }
            //For ending spaces
            for(int c3=0;c3<n-1-r;c3++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int r2=0;r2<n;r2++){
            //For Starting Spaces
            for(int c4=0;c4<r2;c4++){
                System.out.print(" ");
            }
            //For Stars
            for(int c5=0;c5<(((2*n)-1)-(2*r2));c5++){
                System.out.print("*");
            }
            //For Ending Spaces
            for(int c6=0;c6<r2;c6++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
