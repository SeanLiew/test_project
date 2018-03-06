package project.generic;

import java.util.HashMap;
import java.util.Map;

public class Favorites {
	
	private Map<Class<?>, Object> favorites = new HashMap<Class<?>, Object>();
	
	public <T> void putFavorite(Class<T> type, T instance) {
		if(type == null) {
			throw new NullPointerException("type is null");
		}
		favorites.put(type, type.cast(instance));
	}
	
	public <T> T getFavorite(Class<T> type) {
		return type.cast(favorites.get(type));
		
	}
	
	public static void main(String[] args) {
		Favorites f = new Favorites();
		f.putFavorite(String.class, "java");
		f.putFavorite(Integer.class, 0xcafebabe);
		f.putFavorite(Class.class, Favorites.class);
		
		
		String favoriteString = f.getFavorite(String.class);
		Integer favoriteInteger = f.getFavorite(Integer.class);
		Class<?> favoriteClass = f.getFavorite(Class.class);
		
		System.out.println(favoriteString);
		System.out.println(favoriteInteger);
		System.out.println(favoriteClass.getName());
	}
}
