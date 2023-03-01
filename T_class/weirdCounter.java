package T_class;

public class weirdCounter {
    
    public int mystery=-5;

    public void tic(){
        System.out.println("tic");
        mystery--;
    }
    public int get(){return -(mystery+5);}
}
