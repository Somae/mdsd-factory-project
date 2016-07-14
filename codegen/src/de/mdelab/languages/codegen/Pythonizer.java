 package de.mdelab.languages.codegen;

public class Pythonizer {
	
	public String pythonizeName(String name){
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < name.length(); i++){
			if( i != 0 && Character.isUpperCase(name.charAt(i))){
				builder.append('_');
				builder.append(Character.toLowerCase(name.charAt(i)));
			} else{
				builder.append(name.charAt(i));
			}
		}
		return builder.toString();
	}
	
	public String pythonizeConstant(String name){
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < name.length(); i++){
			if( i != 0 && Character.isUpperCase(name.charAt(i))){
				builder.append('_');
				builder.append(name.charAt(i));
			} else{
				builder.append(Character.toUpperCase(name.charAt(i)));
			}
		}
		return builder.toString();
	}
}
