import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class list_set {
    public static void main(String[] args) {
        /*
         * three type of set 1) Hashset FAst
         *                   2) treeset 
         *                   3) linkedhashset
         * list is only one 1) Arraylist
         * 
         * 
         * inside the <> need to mention the type f.e-- Integer, Boolean , float, string etc
         * 
         * inside the () need to mention the set from another set
         * 
         * attributes -- are-- for set-- add, remove,clear,isEmpty, contains, size, 
         * 
         * attributes -- are-- for Arraylist--- all the above as well as, get(index), set(index, element), subList(from_index, to_index)
         * 
         */
        Set<Integer> in= new HashSet<Integer>();// doesnot print everything in order

        in.add(1); // to add something
        in.add(2);
        in.add(3);
        in.add(4);

        boolean l= in.contains(2);
        in.remove(1);// remove a element
        in.clear();// clear the set
        //System.out.println(in.get(1));
        boolean t= in.isEmpty();
        System.out.println(l); // does the set have 2 or not checker print 
        System.out.println(in);// set print
        System.out.println(t); // checking is the set empty 

        Set<Integer> ft = new TreeSet<Integer>(); // print everything in order

        ft.add(19);
        ft.add(12);
        ft.add(13);
        ft.add(14);
        ft.add(15);
        ft.add(16);
        ft.add(17);

        int size_treeset= ft.size();
        System.out.println(size_treeset); 
        System.out.println(ft); // printing the teeset

        
        Set<Integer> lin= new LinkedHashSet<Integer>();

        lin.add(21);
        lin.add(31);
        lin.add(41);
        lin.add(51);
        lin.add(61);
        lin.add(91);
        lin.add(81);// to add something in the set
        System.out.println(lin);// printing the added value from the set

        int size_lin=lin.size();// size 
        System.out.println("the size is for lin " +size_lin); // printing the size

        ArrayList<Integer> lin1 = new ArrayList<Integer>(lin);

        int index_lin1 = lin1.get(0);// index
        System.out.println("the index of number 51 : "+ index_lin1);// index printing

        lin1.set(1,4);
        System.out.println(lin); // old one stays the same 
        System.out.println(lin1); // new element added to lin1 new arraylist

        System.out.println(lin1.size());
        System.out.println(lin1.subList(0,4));


    LinkedList<Integer> list_linked = new LinkedList<Integer>(lin1);
    
    //boolean lin12= list_linked.contains(9);
   
    //list_linked.add(9);

    System.out.println("printing the link list element "+list_linked);
    System.out.println("size: "+list_linked.size());
    System.out.println("get: "+ list_linked.get(1));
    System.out.println("is empty: "+ list_linked.isEmpty());
    System.out.println("add: "+ list_linked.add(9));
    System.out.println("cotains: "+list_linked);
    System.out.println("subList: "+list_linked.subList(1,3));
    System.out.println(" set: "+list_linked.set(1,4));
    System.out.println(list_linked);


    
        /*
         hashset()
t.add()

T.contains();

Boolean x = t.contians (0)
t.remove()
t.clear
t.isEmpty()
T.size()
t.


Treeset()

Is in order


Linkedhashset


Array<Integer> t = new array<integer>();

T.add()
t.get(index)
T.set(1,5) /// change 
t.size
T.sublist()
 

Linked list 




         */

    }
}
