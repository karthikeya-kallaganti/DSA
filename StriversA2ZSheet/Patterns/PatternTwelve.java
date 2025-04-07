/*
Pattern-12
1          1
12        21
12       321
1234    4321
12345  54321
123456654321
 */
import java.util.Scanner;
class PatternTwelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int n = sc.nextInt();
        //Outer Loop
        for (int r = 0; r < n; r++) {
            //For Forward series
            for (int c1 = 0; c1 <= r; c1++) {
                System.out.print(c1 + 1);
            }
            //For Spaces
            int spacecount = ((2 * n) - (2 * r) - 2);
            for (int c2 = 0; c2 < spacecount; c2++) {
                System.out.print(" ");
            }
            //For Backward series
            int backward = r + 1;
            for (int c3 = 0; c3 <= r; c3++) {
                System.out.print(backward);
                backward = backward - 1;
            }
            System.out.println();
        }
    }
}

