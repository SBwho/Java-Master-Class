package classes;

import classes.test_class.Method;

public class submethod extends Method {

    public submethod(String name,int age,String country) {
        super(name,age,country);
        
    }
    public void printing(){
        System.out.println(" name : "+ super.name +" Age: "+super.age+ " country: "+super.country);
    }
    
} 
    

