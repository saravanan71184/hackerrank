package wkofcode28;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class passboats {

	public static void main(String[] args) {
		String filename = "/Users/saravananrajan/git/hackerrank/sar/testdata/wkcode28" ;
		File inpfile = new File(filename);
		
        Scanner in;
		try {
			in = new Scanner(inpfile);
		
        int n = in.nextInt();
        System.out.println("n : "+ n);
        int c = in.nextInt();
        System.out.println("c : "+ c);
        int m = in.nextInt();
        System.out.println("m : "+ m);
        int max_passenger_ina_trip = c*m;
        System.out.println("max_passenger_ina_trip : "+ max_passenger_ina_trip);
        int[] p = new int[n];
        for(int p_i=0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
        }
        
        boolean possorNot = false ;
        for(int i =0; i<p.length ; i++){
        	System.out.println("p[i] :"+ p[i]); 
        	if(p[i] >max_passenger_ina_trip){
            	possorNot = false ;
            	break;
            }else{
            	possorNot = true ;
            }
        }
            if(possorNot){
            	 System.out.println("YES");
            }else{
            	System.out.println("NO");
            }
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
    }
}
