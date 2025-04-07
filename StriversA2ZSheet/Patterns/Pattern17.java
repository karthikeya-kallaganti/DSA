/*
Pattern-17
    A
   ABA
  ABCBC
 ABCDCDE
ABCDEDEFG
 */
import java.util.Scanner;
class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            //starting spaces
            for(int j=0;j<((n-1)-i);j++){
                System.out.print(" ");
            }
            //for char sequence
            int num=65;
            for(int k=0;k<(2*i)+1;k++){
                char a = (char)num;
                System.out.print(a);
                if(k==i){
                    num = num - 1;
                }
                else{
                    num = num + 1;
                }
            }
            //ending spaces
            for(int l=0;l<((n-1)-i);l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

