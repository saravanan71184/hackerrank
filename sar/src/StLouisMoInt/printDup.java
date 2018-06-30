package StLouisMoInt;

import java.util.HashMap;
import java.util.Map;

public class printDup {

	public static void main(String[] args) {
		
		int[] inputArray = {1 , 1, 2 } ;
		int[] resultArray = printDuplicates(inputArray) ;

	}
	
	public static int[] printDuplicates(int[] inpuArray) {
		int[] outputArray = new int[inpuArray.length ] ; 
		
		Map<Integer, Integer> inpuHashMap = new HashMap<>() ; 
		
		for(int i =0 ; i< inpuArray.length ; i++ ) {
			Integer key = inpuArray[i] ;
			inpuHashMap.get(key) ;
		}
	
		
		return outputArray ;
	}

}
