package thirtyDaysofCode;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HourGlass {

	public static int hourglasssum(int[][] inpuArray) {
		SortedSet<Integer> result = new TreeSet<Integer>() ;

		for (int i = 0; i < (inpuArray.length - 2); i++) {
			for (int j = 0; j < (inpuArray[i].length - 2); j++) {
				int sum = (inpuArray[i][j] + inpuArray[i][j + 1] + inpuArray[i][j + 2] + inpuArray[i + 1][j + 1]
						+ inpuArray[i + 2][j] + inpuArray[i + 2][j + 1] + inpuArray[i + 2][j + 2]);
		
				result.add(sum) ;
			}
		}
		int greater ;
		greater = result.last() ;
		
		return greater;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			String[] arrRowFixItems = new String[6];
			int diff = 6 - (arrRowItems.length);

			if (arrRowItems.length < 6) {
				for (int k = 0; k < arrRowItems.length; k++) {
					arrRowFixItems[k] = arrRowItems[k];
				}
				for (int kk = (arrRowItems.length - 1); kk < 6; kk++) {
					arrRowFixItems[kk] = "0";
				}
			}else {
				for (int k = 0; k < arrRowItems.length; k++) {
					arrRowFixItems[k] = arrRowItems[k];
				}
			}
			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowFixItems[j]);
				arr[i][j] = arrItem;
			}
		}

		int sum = hourglasssum(arr);
		System.out.println(sum);
		scanner.close();
	}
}
