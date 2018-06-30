package sar;

import java.util.ArrayList;
import java.util.List;


public class DuplicateWords {

	public static void main(String[] args) {

		List<String> arr = new ArrayList<String>();

		arr.add("5");
		arr.add("Goodbye bye bye world world world");
		arr.add("Sam went went to to to his business");
		arr.add("Reya is is the the best player in eye eye game");
		arr.add("in inthe");
		arr.add("Hello hello Ab aB");

		
		for (int i = 1; i < arr.size(); i++) {
			String s = "";
			String[] arra = arr.get(i).split(" ");
			for(int j=0; j<arra.length; j++){
				for(int k=0; k<arra.length;k++){
					if(arra[i].equalsIgnoreCase(arra[k])){
						
					}
				}
			}
		
			  System.out.println(s.trim());
		}
	}
}
     
        
        
    