package T_class;
public class SillySum {
    public static void main(String[] args) { // args is a parameter
        // 
        int x=32;
        System.out.print(" sum of 32 +4= ");
        System.out.println(3+doit(x,4));



    }// main closing bracket

    public static int doit(int x , int y){

        int result = x;
        int z;
        do{
            result++;
            y--;
        }while(y>0);
        return result;

    }// closing bracket for doit method 
}// class closing bracket 
