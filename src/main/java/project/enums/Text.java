package project.enums;

import java.util.EnumSet;
import java.util.Set;

public class Text {
	public enum Style{BOLD,ITALIC,UNDERLINE,STRIKETHROUGH}
    public void applyStyles(Set<Style> styles){
        //实现方案
    	for (Style style : styles) {
    		System.out.println(style);
		}
    }
    
    public static void main(String[] args) {
    	Text text = new Text();
    	text.applyStyles(EnumSet.of(Style.BOLD,Style.ITALIC));
	}
}
