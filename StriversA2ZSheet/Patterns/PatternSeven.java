/*
Pattern-7
    *
   ***
  *****
 *******
*********
 */
import java.util.Scanner;
class PatternSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int n = sc.nextInt();
        //OuterLoop
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
    }
}