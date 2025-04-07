/*
Pattern-10
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
 */
import java.util.Scanner;
class PatternTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int n = sc.nextInt();

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int r = 0; r < n; r++) {
            for (int c = n - r; c > 0; c--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}