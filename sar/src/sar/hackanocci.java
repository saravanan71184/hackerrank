package sar;
import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class hackanocci {
	static HashMap<Long, Long> series_value = new HashMap<Long, Long>();

	public static void main(String[] args) {

		String s = "//Users//saravananrajan//git//hackerrank//sar//testdata//hackanoss";
		File inpfile = new File(s);

		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(inpfile);
			// Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();

			String[][] seriesarray = new String[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					long k = i + 1;
					long l = j + 1;
					long m = hacknoseriesdef(((k * l) * (k * l)));
					if (m % 2 == 0) {
						seriesarray[i][j] = "X";
					} else {
						seriesarray[i][j] = "Y";
					}
				}
			}

			int q = sc.nextInt();

			for (int a0 = 0; a0 < q; a0++) {
				int angle = sc.nextInt();
				int diff = 0;
angle = getcorrectangle(angle);
				if (angle == 360||angle == 0) {
					System.out.println(0);
				} else if (angle ==270 ) {
					int lenofArray = seriesarray.length;
					String[][] seriesarray_270 = new String[lenofArray][lenofArray];
					int col = seriesarray.length - 1;
					for (int i = 0; i < seriesarray.length; i++) {
						lenofArray = lenofArray - 1;
						for (int j = 0; j < seriesarray.length; j++) {
							seriesarray_270[i][j] = seriesarray[col][j];
						}
						col--;
					}
					int lengofArray = seriesarray_270.length;
					for (int i = 0; i < lengofArray; i++) {
						for (int j = 0; j < lengofArray; j++) {
							if (!seriesarray_270[i][j]
									.equalsIgnoreCase(seriesarray[i][j])) {
								diff = diff + 1;
							}
						}
					}
					System.out.println(diff);
				} else if (angle == 180 ) {
					int lenofArray = seriesarray.length;
					String[][] seriesarray_180 = new String[lenofArray][lenofArray];
					for (int i = 0; i < seriesarray.length; i++) {
						int col = seriesarray.length - 1;
						lenofArray = lenofArray - 1;
						for (int j = 0; j < seriesarray.length; j++) {
							seriesarray_180[i][j] = seriesarray[col][lenofArray];
							col--;
						}
					}

					int lengofArray = seriesarray_180.length;
					for (int i = 0; i < lengofArray; i++) {
						for (int j = 0; j < lengofArray; j++) {
							if (!seriesarray_180[i][j]
									.equalsIgnoreCase(seriesarray[i][j])) {
								diff = diff + 1;
							}
						}
					}
					System.out.println(diff);
				} else if (angle  == 90) {
					int lenofArray = seriesarray.length;
					String[][] seriesarray_90 = new String[lenofArray][lenofArray];
					for (int i = 0; i < seriesarray.length; i++) {
						for (int j = 0; j < seriesarray.length; j++) {
							seriesarray_90[i][j] = seriesarray[lenofArray - 1][j];
						}
						lenofArray = lenofArray - 1;
					}
					int lengofArray = seriesarray_90.length;
					for (int i = 0; i < lengofArray; i++) {
						for (int j = 0; j < lengofArray; j++) {
							if (!seriesarray_90[i][j]
									.equalsIgnoreCase(seriesarray[i][j])) {
								diff = diff + 1;
							}
						}
					}
					System.out.println(diff);
				}
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	
	public static int getcorrectangle(int angle) {
        if(angle >360){
         return( getcorrectangle(angle-360));
        }else{
            return angle;
        }
    }
	
	public static long hacknoseriesdef(long i) {

		if (i == 1) {
			series_value.put((long) 1, (long) 1);

			return 1;
		} else if (i == 2) {
			series_value.put((long) 2, (long) 2);
			return 2;
		} else if (i == 3) {
			series_value.put((long) 3, (long) 3);
			return 3;
		} else {
			if (!series_value.containsKey(i)) {
				long j = (1 * hacknoseriesdef(i - 1))
						+ (2 * hacknoseriesdef(i - 2))
						+ (3 * hacknoseriesdef(i - 3));
				series_value.put(i, j);
				return j;
			} else {
				long j = series_value.get(i);
				return j;
			}

		}

	}
}
