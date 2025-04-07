/*
Pattern-6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */

import java.util.Scanner;
class PatternSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int k=1;
            for(int j=n-i;j>0;j--){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
