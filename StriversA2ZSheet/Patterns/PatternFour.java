/*
Pattern -4
1
2 2
3 3 3
4 4 4 4
 */
import java.util.Scanner;
class PatternFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
}