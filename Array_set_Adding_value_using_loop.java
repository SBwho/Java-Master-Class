import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Array_set_Adding_value_using_loop {
    public static void main(String[] args) {
        System.out.println(adding());

    }
    public static Set<Integer> adding(){
        Scanner input = new Scanner(System.in);// input datatype (scanner)
        int i=0;
        Set<Integer> values_set= new HashSet<Integer>(); 
        do{

            System.out.println(" add your inteder value here: ");
            int scanned= input.nextInt();
            if(scanned==5){
                i=5;
                break;
            }
            values_set.add(scanned);
            System.out.println("to stop press 10");
            
            
        }while(i!=5);
        return values_set;
        
    }
}
