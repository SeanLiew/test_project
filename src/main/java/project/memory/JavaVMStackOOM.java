package project.memory;

/**
 * -Xss2M
 * @Title: JavaVMStackOOM
 * @Description: 
 * @author: Lxz
 * @date: 2017年9月11日上午10:30:33
 */
public class JavaVMStackOOM {
	public static int num = 0;
	private void dontStop(int n){
		while(true){
			System.out.println("线程:"+n);
		}
	}
	
	public void statckLeanByThread(){
		while(true){
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					dontStop(num++);
				}
			});
			thread.start();
		}
	}
	
	public static void main(String[] args) {
		JavaVMStackOOM oom = new JavaVMStackOOM();
		oom.statckLeanByThread();
	}
}
