package test.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Frob{}  
class Fnorkle{}  
class Quark<Q>{}  
class Particle<POSITION,MOMENTUM>{} 
public class ErasedTypeEquivalence {
	/** 
     * ArrayList<String>和ArrayList<Integer>很容易认为是不同的类型， 
     * 不同的类型在行为方面肯定不同 但输出发现c1==c2为true 
     * @param args 
     */  
    public static void main(String[] args) {  
        Class c1=new ArrayList<String>().getClass();  
        Class c2=new ArrayList<Integer>().getClass();  
        System.out.println(c1==c2);//输出为true  
          
        List<Frob> list = new ArrayList<Frob>();  
        Map<Frob,Fnorkle> map = new HashMap<Frob,Fnorkle>();  
        Quark<Fnorkle> quark = new Quark<Fnorkle>();  
        Particle<Long,Double> part=new Particle<Long,Double>();  
        //Class.getTypeParameters()将返回一个Typeariable对象数组，表示有泛型声明  
        //的类型参数...  
        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));  
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));  
        System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));  
        System.out.println(Arrays.toString(part.getClass().getTypeParameters()));  
        /** 
         * 输出结果： 
         * [E] 
           [K, V] 
           [Q] 
           [POSITION, MOMENTUM] 
         */  
        /** 
         * 输出结果是一些占位符 
         * 说明：在泛型代码内部，无法获得任何有关泛型参数类型的信息。 
         * 当你在使用泛型时，任何具体的类型信息都被擦除了，你唯一知道的就是你在使用一个对象。 
         * 因此，List<String>和List<Integer>在运行时事实上是相同的类型。这两种形式都被 
         * 擦除成它们的原生类型，即List 
         */  
    }  
}
