package classes;

public class cat extends Dog{
    /*
     * dog is now the super like pythonù
     * and cat is the subclass like python
     * 
     */
    private int food;
    public cat(String name, int age,int food) { // we can add extra parameter
        super(name, age);
        this.food=food;

    }
    public cat(String name, int age){
        super(name,age);
        this.food=0;
        
    }
    public cat(String name){
        super(name,0);
    }
    public void speak(){
        System.out.println("i am meow "+this.name + " my age is - "+this.age+"food- "+this.food );
    }

    public void eat(int x){
        this.food-=x;
    }
    
}
