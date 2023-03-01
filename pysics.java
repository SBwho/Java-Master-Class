public class pysics {
    public static void main(String[] args) {
        int n=10;
        System.out.print(" ok: ");
        System.out.println(doit(1,-1,n));
        }// main closing bracket

    public static int doit(int x, int y, int n){
        int result=0;
        do{
            for (int i=0; i<n;i++){
                if(i%2==0){
                    result=result+x;
                    n--;
                }// if closing bracket
                else{
                    result= result+y;
                    n--;
            }
        }   
        }while(n>0);
        return result;
    } // do it closing bracket
    }// class closing bracket
