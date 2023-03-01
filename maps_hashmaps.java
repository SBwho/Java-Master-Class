import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class maps_hashmaps {
    public static void main(String[] args) {
        // maps
        /*
         *  three maps -- 1) hashmap() not in order
         *                2) Treemap()  imp- the datatype need to be the same for this hash map ( in order )
         *                3) linkedhashmap()
         * 
         *  some methods are-- put(to add something)
         *                     2) .get(key)
         *                     3) .containsValue()
         *                     4) containsKey()  
         *                     4) .clear() 
         *                     4) .isEmpty()
         *                     4) .remove()
         * 
         * exerceise -- given a string  in a array of character. count all of this charecter into a map
         * example -- have a key that si equal to  the letter and the value for the key is the how many time the charecter occures
         *  
         */

    Map m = new HashMap();
    m.put("piyal",1); // PUTTING VALUE TO THE KEY

    System.out.println("MAps key and value:" +m); // result be like{"time"= 1}

    System.out.println(" Exercise start from here ---");
    Scanner input  = new Scanner(System.in); // scanner datatype
    System.out.println("Type a sentenc--");
    String sent = input.nextLine();


    Map<Character,Integer> m1= new HashMap<>(); // creating map datatype

     // counter for char 
        int count=1;
    for(int i= 0;i<sent.length();i++){ // for(char x: sent.tocharArray()) 
        char x1= sent.charAt(i);
        if(m1.containsKey(x1)){
            
            m1.put(x1,count+1);
        }else{
            m1.put(x1, 1);
        } // else closing bracket   s
        
    }// for looping closing bracket
    System.out.println(m1);
    doit(sent);
    } //main closing bracket


    public static void doit(String sent1){
        Map<Character,Integer> m2 = new HashMap<>();
        for(char x : sent1.toCharArray()){
            if (m2.containsKey(x)){
                int old = m2.get(x);
                m2.put(x,old+1);
        }else{
            m2.put(x,1);
        }
          
        }
         System.out.println(m2);
       
    }

    
}// class closig bracket
