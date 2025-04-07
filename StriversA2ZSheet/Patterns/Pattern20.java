/*
Pattern-20
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
 */
import java.util.Scanner;
class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int n = sc.nextInt();
        //Part-1
        for(int r2=0;r2<n;r2++){
            //Stars
            for(int c4=0;c4<r2+1;c4++){
                System.out.print("*");
            }
            //spaces
            int c= (2*n)-(2*r2)-2;
            for(int c5=0;c5<c;c5++){
                System.out.print(" ");
            }
            //stars
            for(int c6=0;c6<r2+1;c6++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Part-2
        for(int r1=1;r1<n;r1++){
            //Stars
            for(int c1=0;c1<n-r1;c1++){
                System.out.print("*");
            }
            //spaces
            for(int c2=0;c2<2*r1;c2++){
                System.out.print(" ");
            }
            //stars
            for(int c3=0;c3<n-r1;c3++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

