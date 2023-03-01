package T_class;

public class Arraystack {
    private final static int Size= 4;
    public int[] stk; // int array
    /*
     * array be like int[] name= new int[size of the array];
     *               int[] name ={1,2,3,4,5}
     *               
     */
    private int top=-1;

    public Arraystack(){
        stk=new int[Size];
    }
    
    public Arraystack(int l){
        stk= new int[l];
    }

    public int lunghezza(){
        return stk.length;
    }

    public int push(int v){
       return stk[++top]=v;
    }

    public int pop(){
        top=top-1;
        return stk[top+1];
    }




}
