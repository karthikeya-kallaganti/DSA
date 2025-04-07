/*
Pattern-13
1
2  3
4  5  6
7  8  9  10
11  12  13  14  15
16  17  18  19  20  21
 */
import java.util.Scanner;
class PatternThirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int n = sc.nextInt();
        int count = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(count+" ");
                count = count + 1;
            }
            System.out.println();
        }
    }
}

