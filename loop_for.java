import java.nio.channels.ShutdownChannelGroupException;
import java.util.Scanner;

public class loop_for {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // scanner data type
        int[] arr = {1,2,34,5,6,7};
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==(5)){
                System.out.println(" found 4"+ i + arr[i]);
            }   
        }// for loop closing bracket
        int[] arr2=  new int[5];// empty array
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("enter a value: ");
            int arr_2= input.nextInt();
            arr2[i]= arr_2;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(" number  "+i+":" );
            System.out.println(arr2[i]);
        }

        // creating a new empty array
        int[] arr3 = new int[5];
        // then to add elements in 
      //  arr3[0]=1 ;// this is a option 
        for (int i = 0; i < arr3.length; i++) {
            int scanned = input.nextInt();
            arr3[i]=scanned;
            System.out.println(arr3[i]);

        }

    }// main closing bracket
}
