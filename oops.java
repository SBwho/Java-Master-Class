public class oops {
    public static void main(String[] args) {
        /*
         * public static [type of the method ] void tim(parameter ){}
         * 
         */

         // METHOD 
         name(); // void method calling 
         System.out.println(name1("sajjad")); // calling name1 method 
         System.out.println(number(12));

    }// end of main method

    public static void name(){
        System.out.println("Sajjad");
    }// name method ending

    public static String name1(String x){
        return x+" bhuiyan";
    }
    
    public static int number(int x){
        return x+1;
    }
}
