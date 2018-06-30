package karteekwayfairprep;

public class arrayManipulation {

	public static void main(String arg[]) {
		int[] aa = { 4, -19, 3, 0, -5 };
		int[] aaa = rearrageArray(aa);

		for (int i = 0; i < aaa.length; i++) {
			System.out.print(aaa[i] + " ");
		}
	}

	public static int[] rearrageArray(int[] unorArray) {
	//	int[] orderarray = new int[unorArray.length];
//		for (int k = 0; k < orderarray.length; k++) {
//			System.out.println("k"+k );
			for (int j = 1; j < unorArray.length; j++) {
				//System.out.println("j"+k );
				if (unorArray[j-1] < 0 || unorArray[j] < 0) {
					int a = unorArray[j-1];
					int b = unorArray[j];
					unorArray[j] = a;
					unorArray[j-1] = b ;
				}
				
				for (int i = 0; i < unorArray.length; i++) {
					System.out.print(unorArray[i] + " ");
				}
				System.out.println();	
			}
			int count = 1 ;
			for (int k = 1; k < unorArray.length; k++) {
				if((unorArray[k-1] < 0 && unorArray[k] > 0) || count == unorArray.length ) {
					count++ ;
					rearrageArray(unorArray) ;
				}
			}
			
//		}
		return unorArray;
	}
}

