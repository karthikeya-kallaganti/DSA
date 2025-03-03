import java.util.Scanner;
class ThingsToKnow{
    public static void main(String[] args){
        /**
        * Java Output: mainly uses three functions
        * print(): prints all the mentioned charachters within the quotes
        * println():works like print only but the cursor starts at a new line
        * printf():used for formatting strings
         */

        System.out.print("1.print() function"); //same line
        System.out.print("2.print() function"); //same line

        System.out.println("1.println() function");//same line
        System.out.println("2.println() function");//new line

        int x = 5;
        System.out.printf("This is a formatted statement %d",x); //printf functionality similar to one in C/C++

        /**
         * Java Input :
         * Can be implemented using scanner(For small objects) and buffered Reader(for files)
         * uses system.in object of the Scanner class to read objects from console
         * nextInt():To read integers
         * nextFloat():To read float values
         * nextDouble():To read double values
         * next():To read string values until whitespace is encountered
         * nextLine():Reads the entire line
         */

        //Create a Scanner object
        Scanner sc = new Scanner(System.in);
        //To read Integer values
        int inp = sc.nextInt();
        //To read Float values
        float inpf = sc.nextFloat();
        //To read double values
        double inpd = sc.nextDouble();
        //To read string
        String inps = sc.next();
        //To read the entire string
        String inpss = sc.nextLine();

        /**
         * Data Types : Primitive Data Types:
         * Int:byte,short,int,long
         * Char
         * Float : Double(default),Float
         * Boolean : True/False
         * Since these datatypes are primitive and do not extend any classes hencforth java is not purely,
         * an object oriented language
         */

        //If-Else Staments
        if(15>10){System.out.println("If-condition-business logic"); }
        else if (15<20) { System.out.println("Else if condition");
        }
        else{ System.out.println("Else condtion");
        }

    }
}