/*
Pattern-18
E
D E
C D E
B C D E
A B C D E
 */
import java.util.Scanner;
class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int num = 64 + n - i;
            for(int j=0;j<=i;j++){
                char a = (char)num;
                System.out.print(a+" ");
                num = num + 1;
            }
            System.out.println();
        }
    }
}


