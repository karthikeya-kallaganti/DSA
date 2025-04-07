/*
Pattern-3
1
1 2
1 2 3
1 2 3 4
 */
import java.util.Scanner;
class PatternThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}
