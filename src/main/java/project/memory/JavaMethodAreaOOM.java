package project.memory;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 	-XX:PermSize=10M -XX:MaxPermSize=10M
 * @Title: JavaMethodAreaOOM
 * @Description: 
 * @author: Lxz
 * @date: 2017年9月11日下午1:51:18
 */
public class JavaMethodAreaOOM {
	public static void main(String[] args) {
		while(true){
			Enhancer enhancer = new Enhancer();
			enhancer.setSuperclass(OOMObject.class);
			enhancer.setUseCache(false);
			enhancer.setCallback(new MethodInterceptor() {
				@Override
				public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
					return proxy.invoke(obj, args);
				}
			});
			enhancer.create();
		}
	}
	
	static class OOMObject{}
}
