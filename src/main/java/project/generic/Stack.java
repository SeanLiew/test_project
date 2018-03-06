package project.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;

public class Stack<E> {
	public Stack() {
		
	}
	
	public void push(E e) {
		
	}
	
	public E pop() {
		return null;
	}
	
	public boolean isEmpty() {
		return false;
	}
	
	public void pushAll(Iterable<? extends E> src) {
		for (E e : src) {
			push(e);
		}
	}
	
	public void popAll(Collection<? super E> dst) {
		while(!isEmpty()) {
			dst.add(pop());
		}
		
	}
	
	public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2){
		Set<E> result = new HashSet<E>(s1);
		result.addAll(s2);
		return result;
	}
	
	public static <T extends Comparable<? super T>> T max(List<? extends T> list) {
		Iterator<? extends T> iterator = list.iterator();
		T result = iterator.next();
		while(iterator.hasNext()) {
			T t = iterator.next();
			if(t.compareTo(result) > 0) {
				result = t;
			}
		}
		return result;
		
	}
	
	
	public static void swap(List<?> list, int i, int j) {
		swapHelper(list, i, j);
	}
	
	public static <E> void swapHelper(List<E> list, int i, int j) {
		list.set(i, list.set(j, list.get(i)));
	}
	
	public static void main(String[] args) {
//		Stack<Number> numberStack = new Stack<Number>();
//		Iterable<Integer> integers = new ArrayList<Integer>();
//		numberStack.pushAll(integers);
//		
//		Collection<Object> objects = new ArrayList<Object>();
//		numberStack.popAll(objects);
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(new Integer("1"));
		Set<Double> dou = new HashSet<Double>();
		dou.add(new Double("2.20"));
		
		Set<Number> union = union(set, dou);
		System.out.println(union);
		
		
		List<ScheduledFuture<?>> list = new ArrayList<ScheduledFuture<?>>();
		ScheduledFuture<?> max = max(list);
		
		
	}
}
