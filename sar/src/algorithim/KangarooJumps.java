package algorithim;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KangarooJumps {



	public static void main(String[] args) {

		String filename = "/Users/saravananrajan/git/hackerrank/sar/testdata/algorithim/KangarooJmps";
		File inpfile = new File(filename);

		Scanner in;
		try {
			in = new Scanner(inpfile);

			int x1 = in.nextInt();
			int v1 = in.nextInt();
			int x2 = in.nextInt();
			int v2 = in.nextInt();
			System.out.println("x1 :"+x1 +"\n"+ 
							"v1 :"+v1 +"\n" + 
							"x2 :"+x2 +"\n" +
							"v2 :"+v2 +"\n" );
			
			if(x2>x1 && v2 >v1 ){
			int y = (x2-x1)%(v2-v1) ;
			int z = x1-x2 ;
			int f = v2-v1 ;
			System.out.println("x1-x2 :" +  z);
			System.out.println("v2-v1 :" +  f);
			System.out.println("Y :" +  y);
					
			if(y == 0){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			}
			System.out.println("NO");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
