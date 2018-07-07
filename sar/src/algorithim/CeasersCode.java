package algorithim;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Stream;

public class CeasersCode {

	public static void main(String[] args) {

		String s = "middle-outz";
		int k = 2;
		String result = caesarCipher(s, k);

		System.out.println(result);
		;

	}

	// Complete the caesarCipher function below.
	static String caesarCipher(String s, int k) {

	//	String[] originalAlphabets = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
	//			"q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
		String[] originalAlphabets = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
				"q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
		String[] rotatedAlphabets = new String[originalAlphabets.length];
		for (int i = 0; i < originalAlphabets.length; i++) {
			int rotatseq = (i + k) % originalAlphabets.length;
			rotatedAlphabets[i] = originalAlphabets[rotatseq];
		}

		HashMap<String, String> ceaserMap = new HashMap<String, String>();

		for (int i = 0; i < originalAlphabets.length; i++) {
			ceaserMap.put(originalAlphabets[i], rotatedAlphabets[i]);
		}

		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < s.length(); j++) {
			if (ceaserMap.get(String.valueOf(s.charAt(j))) != null) {
				sb.append(ceaserMap.get(String.valueOf(s.charAt(j))));
			} else {
				sb.append(String.valueOf(s.charAt(j)));
			}
		}

		String result = sb.toString();

		return result;

	}

}
