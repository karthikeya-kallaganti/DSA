/*
Pattern-21
*****
*   *
*   *
*   *
*****
 */
import java.util.Scanner;
class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int n = sc.nextInt();
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                if(r==0 || r==n-1){
                    System.out.print("*");
                } else if (c==0||c==n-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

