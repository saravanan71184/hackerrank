package sar;
import java.util.HashMap;

public class arrayposandneg {

	public static void main(String[] args) {
		int[] inparray = {0 , 3 ,4 , -1 , -9} ;
		int[] outputarray = new int[inparray.length];
		HashMap<Integer, Integer> valhash = new HashMap<>();
		for(int i=0; i<inparray.length ; i++) {
			valhash.put(i, inparray[i]) ;
		}
		
		int count =0;
		for(int j=0; j<inparray.length;j++) {
			if(inparray[j]<0) {
				outputarray[count] = valhash.get(j) ;
				count++;
			}
		}
		
		for(int j=0; j<inparray.length;j++) {
			if(inparray[j]==0) {
				outputarray[count] = valhash.get(j) ;
				count++;
			}
		}
		
		for(int j=0; j<inparray.length;j++) {
			if(inparray[j]>0) {
				outputarray[count] = valhash.get(j) ;
				count++ ;
				
			}
		}
		
		for(int i=0; i<outputarray.length ; i++) {
			System.out.print( outputarray[i] + ", ") ;
		}

	}

}
