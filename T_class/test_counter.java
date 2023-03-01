package T_class;

public class test_counter {
    public static void main(String[] args) {
        
    
    // just a main to test a Counter
        counter c1 = new counter();// creating a method datatype
        counter c2 = new counter(); // creating a method datatype
        weirdCounter c3 = new weirdCounter();// creating a method datatype

        c1.tic();// calling tic method 
        c1.tic();//calling tic method
        c1.tic();//calling tic method

        System.out.println("counter c1 counts " + c1.get());//calling get method 
        System.out.println(c3.get());//calling get method

        c3.tic();//calling tic method
        c3.tic();//calling tic method
        System.out.println("counter WeirdCounter counts " + c3.get());//calling get method 
        System.out.println("...while WeirdCounter still counts " + c3.get());//calling get method
        
}
}
