package project;

import java.util.HashMap;

public class TestClass {
	static Pet pet;
	static class PetCounter extends HashMap<String, Integer>{
		public void count(String type) throws ClassNotFoundException{
			Integer count = get(type);
			Class.forName("").isInstance(pet);
		}
	}
}
class Pet{}
