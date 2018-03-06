package project.model;

public class Source {  
	  
    public void method1() {  
        System.out.println("this is original method!");  
    }  
    @Override
    public boolean equals(Object obj) {
    	return super.equals(obj);
    }
    @Override
    public int hashCode() {
    	// TODO Auto-generated method stub
    	return super.hashCode();
    }
}  

