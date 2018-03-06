package project.jvm;

//-XX:+PrintCompilation
//-XX:+PrintAssembly
public class Compiler {
	public static final int NUM = 15000;
	
	public static int doubleValue(int i) {
		for (int j = 0; j < 1000; j++) {}
		return i * 2;
	}
	
	public static long calcsum() {
		long sum = 0;
		for (int j = 0; j < 1000; j++) {
			sum += doubleValue(j);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < NUM; i++) {
			calcsum();
		}
	}
}
