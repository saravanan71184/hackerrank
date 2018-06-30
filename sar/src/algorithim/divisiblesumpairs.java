package algorithim;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class divisiblesumpairs {

	static int divisibleSumPairs(int n, int k, int[] ar) {

		int sum = 0;
		int result = 0;
		for (int i = 0; i < ar.length; i++) {
//			for (int j = 0; j < ar.length; j++) {
				sum = ar[i] + ar[i+1];
				if (sum == k || k == (sum / k)) {
					result = result + 1;
				}
//			}
		}
		return (result / 2);
	}

	public static void main(String[] args) {

		String filename = "/Users/saravananrajan/git/hackerrank/sar/testdata/algorithim/divisblesumpairs";
		File inpfile = new File(filename);

		Scanner in;
		try {
			in = new Scanner(inpfile);

			int n = in.nextInt();
			int k = in.nextInt();
			int[] ar = new int[n];
			for (int ar_i = 0; ar_i < n; ar_i++) {
				ar[ar_i] = in.nextInt();
			}
			int result = divisibleSumPairs(n, k, ar);
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
