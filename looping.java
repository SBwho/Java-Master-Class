import java.util.Scanner;

public class looping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // scanner variable 
        System.out.println("Enter a number: ");
        int n = input.nextInt();

        while(n!=10){
            System.out.println("press 10 to stop: ");
            System.out.println("Enter a number: ");
            n= input.nextInt();
            

        }

    }
}
