package worldcodesprint9;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class weightedstrings {

	public static void main(String[] args) {
		String filename = "/Users/saravananrajan/git/hackerrank/sar/testdata/worldcodesprint9/gradingpoints"; 
		File inpfile = new File(filename);
		HashMap<String, Integer> weightmap = new HashMap<String, Integer>();
		weightmap.put("a", 1);
		weightmap.put("b", 2);
		weightmap.put("c", 3);
		weightmap.put("d", 4); 
		weightmap.put("e", 5); 
		weightmap.put("f", 6); 
		weightmap.put("g", 7); 
		weightmap.put("h", 8); 
		weightmap.put("i", 9); 
		weightmap.put("j", 10); 
		weightmap.put("k", 11); 
		weightmap.put("l", 12); 
		weightmap.put("m", 13); 
		weightmap.put("n", 14); 
		weightmap.put("o", 15); 
		weightmap.put("p", 16); 
		weightmap.put("q", 17); 
		weightmap.put("r", 18); 
		weightmap.put("s", 19); 
		weightmap.put("t", 20); 
		weightmap.put("u", 21); 
		weightmap.put("v", 22); 
		weightmap.put("w", 23); 
		weightmap.put("x", 24); 
		weightmap.put("y", 25); 
		weightmap.put("z", 26); 
		Scanner in;
		try {
			in = new Scanner(inpfile);
			String st = in.next();
			int numberofweights = in.nextInt();
			List<Integer> listofweights = new ArrayList<Integer>();
			for(int itr=0; itr< numberofweights;itr++){
				listofweights.add(in.nextInt());
			}
			int lenofsting = st.length();
			


		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
