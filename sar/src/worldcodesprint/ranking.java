package worldcodesprint;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class ranking {

	public static void main(String[] args) {
		String filename = "/Users/saravananrajan/git/hackerrank/sar/testdata/wcsprint" ;
		File inpfile = new File(filename);
		 try {
			Scanner in=new Scanner(inpfile);
			int n = in.nextInt();
			TreeSet<Integer> scores = new TreeSet<Integer>(Collections.reverseOrder());
			for(int scores_i=0; scores_i < n; scores_i++){
	            scores.add(in.nextInt());
	        }
			int numofLevel = in.nextInt();
			for(int startoflevel=0; startoflevel < numofLevel; startoflevel++){
	            int score_in_cur_levl = in.nextInt();
	            scores.add(score_in_cur_levl);
	            List<Integer> list = new ArrayList<Integer>(scores);            
	            System.out.println(list.indexOf(score_in_cur_levl)+1);
	            scores.remove(score_in_cur_levl);
	        }
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
