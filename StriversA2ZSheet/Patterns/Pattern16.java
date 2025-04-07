/*
Pattern-16
A
B B
C C C
D D D D
E E E E E
 */
import java.util.Scanner;
class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int n = sc.nextInt();
        int num=65;
        for(int i=0;i<n;i++){
            char a =(char)num;
            for(int j=0;j<=i;j++){
                System.out.print(a+" ");
            }
            num = num + 1;
            System.out.println();
        }
    }
}
