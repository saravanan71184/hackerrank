package worldcodesprint9;

import java.io.File;
import java.util.Scanner;

public class gradingpass {

	public static void main(String args[]) {
		String filename = "/Users/saravananrajan/git/hackerrank/sar/testdata/worldcodesprint9/gradingpoints";
		File inpfile = new File(filename);

		Scanner in;
		try {
			in = new Scanner(inpfile);
			int n = in.nextInt();
			for(int i=0; i< n;i++){
				int grade = in.nextInt();
				if(grade < 38){
					System.out.println(grade);
				}else if(grade%5 == 0){
					System.out.println(grade);
				}else if(grade%5 == 3 ){
					System.out.println(grade+2 );
				}else if(grade%5 == 4 ){
					System.out.println(grade+1 );
				}else{
					System.out.println(grade);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
