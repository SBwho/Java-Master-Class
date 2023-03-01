import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // scanner variable
        int x;

        do {
            System.out.println("Enter a number: ");
            x=input.nextInt();
            System.out.println("press 10 to stop: ");

        } while ( x!=10); 
    }// main closing bracket
} // class closing braket
 
