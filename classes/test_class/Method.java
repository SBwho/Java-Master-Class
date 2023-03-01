package classes.test_class;

public class Method {
    public int entrance_counter=0;
    public String name;
    public int age;
    public String country;


    public Method(String name, int age,String country){ // constractor
        this.name= name;
        this.age= age;
        this.country=country;

    }

    public void pop(){
        
        System.out.println("Name : "+ this.name +" Age: "+this.age+" Country: "+this.country);
        pop_caller();
    }
    public void pop_caller(){
        ++entrance_counter;
        System.out.println("this line was printed :" +entrance_counter);
    }
    public int push(int age){
        return this.age=age;
       // return this.name;
        //return this.country;
    }
    public String push(String name){
        //return this.age;
        return this.name=name;
       // return this.country;
    }
    public String countryname(String country){
        //return this.age;
        //return this.name;
        return this.country= country;
    }

    public Method(String name){
        this.name=name;
        this.age=0;
        this.country="bd";
    }
    
}// method class closing bracket
