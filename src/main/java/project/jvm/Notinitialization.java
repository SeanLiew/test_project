package project.jvm;

public class Notinitialization {
	public static void main(String[] args) {
//		System.out.println(SubClass.value);
		
//		SuperClass[] sca = new SuperClass[10];
		System.out.println(ConstatnClass.HELLO);
	}
}
class SuperClass{
	static {
		System.out.println(" SuperClass init");
	}
	
	public static int value = 123;
}

class SubClass extends SuperClass{
	static {
		System.out.println(" SubClass init");
	}
}

class ConstatnClass{
	static {
		System.out.println(" ConstatnClass init");
	}
	
	public static final String HELLO = "HELLO WORLD";
}