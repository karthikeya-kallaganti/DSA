/*
Pattern-15
A B C D E
A B C D
A B C
A B
A
 */
import java.util.Scanner;
class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int num = 65;
            for(int j=n-i;j>0;j--){
                char a = (char)num;
                System.out.print(a+" ");
                num = num + 1;
            }
            System.out.println();
        }
    }
}
