
public class ConstructorChaining {

	 public static void main(String args[]) {
		   
	        /* This will first call one argument constructor of Child Class which
	        *  in turn call corresponding constructor of super class using super(String)*/
	        System.out.println("Constructor Chaining Example in Java");
	        System.out.println("---------------------------------");
	        
	        
	        System.out.println("\nConstructor Chaining between Parent and Child Class ");
	        System.out.println("---------------------------------");
	        
	        /* This will first call two argument constructor of Child Class which
		    *  in turn will call one String argument constructor of super class using super(String)*/
	        Child child = new Child("Praveen","Balijepalli");
	     
	        
	        /* This constructor will call no argument constructor of Child, which then 
	         * calls one argument constructor of same class */
	        System.out.println("\nSame Class Constructor Chaining ");
	        System.out.println("---------------------------------");
	        Child emptyChild = new Child();
	    }
	 
	}


	class Parent{
	    private String name;
	    
	    /*
	     * No argument constructor of the Parent
	     */
	    protected Parent(){

	    }
	    
	    /*
	     * One String argument constructor of Parent
	     */
	     
	    protected Parent(String name){
	        this.name = name;
	        System.out.println("One String argument constructor of Parent called ");
	    }
	}

	class Child extends Parent{
	    private String name = "";
	 
	    /*
	     * Calling constructor same class with one argument
	     */
	    protected Child(){
	    	this(" ");
	        System.out.println("No argument constructor of Child called ");
	    }
	 
	    /*
	     * Two String Argument Constructor calling one string Argument constructor of Parent
	     */
	    protected Child(String firstName, String lastName){
	    	super(firstName + lastName);
	    	System.out.println("Two argument constructor of Child called ");       
	    }
	    
	    /*
	     * One String Argument Constructor
	     */
	    protected Child(String name){
	       System.out.println("One argument constructor of Child called");
	    }
	}


