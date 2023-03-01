package classes.test_class;

import classes.submethod;

public class mainmethod {
    public static void main(String[] args) {
        Method sajjad = new Method("sajjd", 8, " bangladesh");
        sajjad.pop();

        Method mota = new Method("mota  ", 10, " bangladesh");
        mota.pop();

        sajjad.push(9);
        sajjad.pop();
        sajjad.push("Bhuiyan");
        sajjad.pop();
        mota.pop();


        Method saykat = new Method("saykat");
        saykat.pop();

        System.out.println(" inher");
        submethod Atif = new submethod("atif",22, "bd");

        Atif.printing();





    }
    
}
