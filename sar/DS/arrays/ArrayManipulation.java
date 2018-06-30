package arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayManipulation {

	// Complete the arrayManipulation function below.
	static long arrayManipulation(int n, int[][] queries) {

		long result = 0;

		int xaxisLength = queries.length;
		System.out.println("xaxisLength : "+xaxisLength); 
		int yaxisLength = queries[0].length;
		System.out.println("yaxisLength : "+yaxisLength); 

		long[][] summadarray = new long[queries.length + 1][n];
		int b = 0 ;
		for (int a = 0; a < xaxisLength; a++) {
			for ( b = 0; b < yaxisLength; b = b + 3) {

				System.out.println("a :"+a);
				System.out.println("b :"+b);
				int aIndex = queries[a][b];
				System.out.println("aIndex :"+aIndex);
				int bIndex = queries[a][b + 1];
				System.out.println("bIndex :"+bIndex);
				long k = Long.valueOf(queries[a][b + 2]);
				System.out.println("k :"+k);
				for (int j = 0; j < n; j++) {
				
						if (j >= (aIndex - 1) && j <= (bIndex - 1)) {
							summadarray[a+1][j] = summadarray[a][j] + k;
						}else {
							summadarray[a+1][j] = summadarray[a][j] ;
						}
						if(result < summadarray[a+1][j]) {
							result = summadarray[a+1][j] ;
						}
				
//					System.out.print(summadarray[a][j] + " ");
				}
//				System.out.println();
			}
			b= 0;
			
//			System.out.println("*****************************************************");	
		}

//		System.out.println("_________________________________");
//		System.out.println("summadarray.length : "+summadarray.length);
//		System.out.println("summadarray[0].length : "+summadarray[0].length);
//		System.out.println("summadarray[][] "+summadarray[0][0] );
//		long largest = 0 ;
//		for (int m = 0; m < summadarray.length; m++) {
//			for (int o = 0; o < summadarray[m].length; o++) {
//				System.out.print(summadarray[m][o] + " ");
//				if(largest < summadarray[m][o] ) {
//					largest = summadarray[m][o]  ;
//				}
//			}
//			System.out.println();
//		}
		
//		result = largest ;
//		System.out.println("result :"+result); 

		return result;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String OUTPUT_PATH = "//Users//saravananrajan//Documents//output.rtf";
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(OUTPUT_PATH));

		String[] nm = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nm[0]);
		/*
		 * 10 3 1 5 3 4 8 7 6 9 1
		 */
		int m = Integer.parseInt(nm[1]);

		int[][] queries = new int[m][3];

		for (int i = 0; i < m; i++) {
			String[] queriesRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 3; j++) {
				int queriesItem = Integer.parseInt(queriesRowItems[j]);
				queries[i][j] = queriesItem;
			}
		}

		long result = arrayManipulation(n, queries);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}


/* optimal solution

Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int m = scan.nextInt();
        
//This will be the "difference array". The entry arr[i]=k indicates that arr[i] is exactly k units larger than arr[i-1]
long[] arr = new long[n];
        
int lower;
int upper;
long sum;

for(int i=0;i<n;i++) arr[i]=0;

for(int i=0;i<m;i++){
    lower=scan.nextInt();
    upper=scan.nextInt();
    sum=scan.nextInt();
    arr[lower-1]+=sum;
    if(upper<n) arr[upper]-=sum; 
}
        
long max=0;
long temp=0;

for(int i=0;i<n;i++){
    temp += arr[i];
    if(temp> max) max=temp;
}

System.out.println(max);

*/