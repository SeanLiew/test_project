package test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class<?> clazz = MyTest.class;
		MyTest tester = (MyTest)clazz.newInstance();
//		Method geneIdMethod = clazz.getMethod("geneId", Array.newInstance(int.class, 0).getClass());
		Method geneIdMethod = clazz.getMethod("geneId", (new int[0]).getClass());
		Object result = geneIdMethod.invoke(tester, new int[] {1, 2, 3, 4});
		System.out.println((String)result);
		
		Field nameField = clazz.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(tester, "jack");
		String name = tester.getName();
		System.out.println(name);
	}
}
