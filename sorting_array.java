import java.util.Arrays;

public class sorting_array {
    public static void main(String[] args) {
        /*
         *  Arrays.sort(Name_of_array , starting_index, end_index)
         * TO GET SIZE IF IT IS STRING IT WOULD BE 
         *          STRING NAME.LENGTH 
         * IF IT IS INT
         *          INT NAME. LENGTH()
         */
        int[] x= {-99,12,3,4,5,6,7,8,9};
        int l= x.length;
        Arrays.sort(x,1,l-1);
        for (int i:x){
            System.out.print(i+ " ,");
    }
        }
         
}
