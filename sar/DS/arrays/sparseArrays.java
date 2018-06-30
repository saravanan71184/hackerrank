package arrays;

import java.io.*;
import java.util.*;

public class sparseArrays {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] inpArray, String[] queries) {
        int numofqueries = queries.length ;
        int[] result = new int[numofqueries] ;
       
        List<String> inpArraylist = Arrays.asList(inpArray) ; 
            for(int j=0 ; j<numofqueries; j ++){
                int occurance = Collections.frequency(inpArraylist, queries[j]);  
                result[j] =  occurance ;
              //  System.out.println("occurance"+ occurance); 
            }
            
			return result;
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
    		String OUTPUT_PATH = "//Users//saravananrajan//Documents//output.rtf" ;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(OUTPUT_PATH));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
        	
        		System.out.println("res[i]"+res[i]); ;
        //    bufferedWriter.write(String.valueOf(res[i]));

          //  if (i != res.length - 1) {
            //    bufferedWriter.write("\n");
           // }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

/* 
 * 4
aba
baba
aba
xzxb
3
aba
xzxb
ab
 */
