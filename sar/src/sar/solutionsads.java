package sar;
public class solutionsads {

	public static void main(String[] args) {
		
		String binaryString = "10000010001" ;//Integer.toBinaryString(1041);
		int lengthofbinaryString = binaryString.length(); // 11
		
		System.out.println("lengthofbinaryString:" + lengthofbinaryString);
		
		String finalString = methodname((lengthofbinaryString - 2),  binaryString);
		System.out.println("value:" + finalString);

		

	}

	public static String methodname(int n, String binaryString) {
		
		

		String zero = "0";
		String zeroplus = "" ;
		System.out.println("value of n:" + n);
		for (int j = n; j > 0; j--) {
			zeroplus = zeroplus + zero;
		}
		String finalString = "1" + zeroplus + "1";
		
		System.out.println("value of finalString:" + finalString);
		
		if (binaryString.contains(finalString)) {
			System.out.println("inside if " + (binaryString.length() - 2));
		} else {
			int nn = finalString.length() -  1;
			 methodname(nn, binaryString);
			
		}
		
		return finalString;

	}

}
