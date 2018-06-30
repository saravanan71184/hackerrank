package wkofcode28;

import java.io.File;
import java.util.Scanner;

public class xbitwiseor {

	public static void main(String[] args) {
		String filename = "/Users/saravananrajan/git/hackerrank/sar/testdata/wkofcode28/xbitwiseor";
		File inpfile = new File(filename);

		Scanner in;
		try {
			in = new Scanner(inpfile);
			int num_of_queries = in.nextInt();
			for (int i = 0; i < num_of_queries; i++) {
				long x = in.nextLong();
				long j = 1;
				int numof_bitwisevalue_gt_x = 0;
				while (j <= x) {
					long bitwisevalue = j ^ x;
					if(bitwisevalue > x){
						numof_bitwisevalue_gt_x++;
					}
					j++;
				}
				System.out.println("x :"+ x+ "numof_bitwisevalue_gt_x :"+ numof_bitwisevalue_gt_x);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
// 9223372036854775807
// 10000000000