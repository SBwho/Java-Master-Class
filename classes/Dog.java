package classes;

public class Dog {
    /*
     * class is a datatype
     * attribe hold information for us 
     * 
     */
    // create 5 dog with name and add age
    public String name;// private
    public int age;// private
     
    // constractor method 

    public Dog(String name , int age){ // constractor 
        this.name = name;
        this.age= age;
        add2();

    }

    public void speak(){
        System.out.println(" i am "+ this.name + " age "+age);
    }

    public int getage(){
        return this.age;
    }
    public int setage(int age){
        return this.age= age;
    }

    private int add2(){
        return this.age+2;
    }
}
