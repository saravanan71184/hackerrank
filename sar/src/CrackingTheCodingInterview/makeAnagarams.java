package CrackingTheCodingInterview;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class makeAnagarams {

	public static void main(String[] args) {
		String a = "fcrxzwscanmligyxyvym";
		String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		int res = makeAnagram(a, b);
		System.out.println("res : " + res);

	}

	static int makeAnagram(String a, String b) {

		int result = 0;
		int alength = a.length();
		int blength = b.length();

		int max = 0;
		if (alength > blength) {
			max = alength;
		} else {
			max = blength;
		}

		HashMap<Character, Integer> aHashMap = new HashMap();
		HashMap<Character, Integer> bHashMap = new HashMap();

		for (int i = 0; i < max; i++) {
			if (i <= (alength - 1)) {
				Character achar = Character.valueOf(a.charAt(i));
				if (aHashMap.get(achar) == null) {
					aHashMap.put(achar, 1);
				} else {
					int temp = Integer.valueOf(aHashMap.get(achar));
					temp = temp + 1;
					Integer acount = new Integer(temp);
					aHashMap.put(achar, acount);
				}
			}
			if (i <= (blength - 1)) {
				Character bchar = Character.valueOf(b.charAt(i));
				if (bHashMap.get(bchar) == null) {
					bHashMap.put(bchar, 1);
				} else {
					int btemp = Integer.valueOf(bHashMap.get(bchar));
					btemp = btemp + 1;
					Integer bcount = new Integer(btemp);
					bHashMap.put(bchar, bcount);
				}
			}
		}

		Character[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };


		
		for (int j = 0; j < charArray.length; j++) {

			Integer aCount = 0;
			Integer bCount = 0;
			
			if (aHashMap.get(charArray[j]) != null) {
				aCount = aCount + aHashMap.get(charArray[j]);

			}
			if (bHashMap.get(charArray[j]) != null) {
				bCount = bCount + bHashMap.get(charArray[j]);
			}
			
			System.out.println(charArray[j] + " acount : " + aCount + " bcount : " + bCount );
			Integer finalValue = aCount - bCount;
			
			if (finalValue < 0) {
				finalValue = finalValue * (-1);
			}
			
			result = result + Integer.valueOf(finalValue);
			
			
		}
		
		

		

		return result;
	}

}
