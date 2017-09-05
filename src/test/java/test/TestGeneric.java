package test;

import java.util.ArrayList;
import java.util.List;


class Food{}
class Fruit extends Food{}
class Apple extends Fruit{}
class Jonathan extends Apple{}
class Plate<T>{
	 private T item;
	 public Plate(T t){item=t;}
	 public void set(T t){item=t;}
	 public T get(){return item;}
}
public class TestGeneric {
	static List<Apple> apples = new ArrayList<Apple>();
	static List<Fruit> fruit = new ArrayList<Fruit>();
	
	private void main() {
		List<? extends Fruit> flist = new ArrayList<Apple>();
//		flist.add(new Fruit());
//		flist.add(new Apple());
//		flist.add(new Jonathan());
//		flist.add(new Object());
		Fruit f = flist.get(1);
	}
	static void writeTo(List<? super Apple> list) {
		list.add(new Apple());
		list.add(new Jonathan());
//	    list.add(new Fruit()); // Error
	}
	static void plate(List<? super Apple> list) {
		Plate<? super Fruit> p=new Plate<Fruit>(new Apple());
		p.set(new Fruit());
		p.set(new Apple());
//		Apple newFruit3=p.get(); 
		
	}

	static class CovariantReader<T> {
		T readCovariant(List<? extends T> list) {
			return list.get(0);
		}
	}

	static void f3() {
		CovariantReader<Fruit> fruitReader = new CovariantReader<Fruit>();
		Fruit f = fruitReader.readCovariant(fruit);
		Fruit a = fruitReader.readCovariant(apples);
	}
}
class Point<T>  
{  
    private T x;  
    private T y;  
    public T getX()  
    {  
        return x;  
    }  
    public void setX(T x)  
    {  
        this.x = x;  
    }  
    public T getY()  
    {  
        return y;  
    }  
    public void setY(T y)  
    {  
        this.y = y;  
    }  
}  
class Demo2  
{  
    static void show(Point<? extends Apple> p){}//此时这个函数只能接收Number及其子类 此时show(p2)会报错  
    static void show2(Point<? super Apple> p)//此时这个函数只能接收String及其父类  此时show(p1)会报错  
    {  
    }  
    public static void main(String[] args)  
    {  
        Point<Apple> p1 = new Point<Apple>();  
        Point<String> p2 = new Point<String>();  
        show(new Point<Apple>());  
        show(new Point<Jonathan>());  
//        show(new Point<Fruit>());  
        show2(new Point<Apple>());  
        show2(new Point<Fruit>());  
//        show2(new Point<Jonathan>());  
    }  
} 
