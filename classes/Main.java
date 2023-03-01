package classes;

public class Main {
    public static void main(String[] args) {
        Dog tim = new Dog("tim", 4); // adding values to the constractor 
        tim.speak();
        Dog mota = new Dog("mota", 5);
        mota.speak();
        Dog atif = new Dog("atif", 6);
        atif.speak();

        int x = tim.getage(); // asking for the age 
        int y= mota.getage(); // same here

        System.out.println(x); // printing that age
        System.out.println(y);// printint that age

        tim.setage(10); // adding new age for tim
        tim.speak(); // print call of dog

     /// calling cat method
     System.out.println("cat method ---");
     cat saykat = new cat("Saykat",20,100);
        saykat.speak();
        saykat.eat(5);
        saykat.speak();


        cat sajjad = new cat("sajjad");
        sajjad.speak();



    }// main closing bracket

}// class closing bracket
