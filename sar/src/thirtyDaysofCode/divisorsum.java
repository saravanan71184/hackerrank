package thirtyDaysofCode;

import java.util.*;

interface AdvancedArithmetic {
	int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
	public int divisorSum(int n) {
		List<Integer> divList = new ArrayList<Integer>();
		System.out.println("Math.sqrt(n) "+Math.sqrt(n)) ;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (n / i == i) {
					divList.add(n / i);
					System.out.println("n/i inside if: "+n/i) ;
				}else {
					divList.add(i);
					divList.add(n/i);
					System.out.println("inside else"+n/i) ;
				}
			}
			System.out.println("i: "+i) ;
		}
		int sum = 0;
		for (int j = 0; j < divList.size(); j++) {
			System.out.println(divList.get(j));
			sum = sum+ divList.get(j);
		}
		return sum;
	}
}

public class divisorsum {
	public static void main(String[] args) {
		AdvancedArithmetic myCalculator = new Calculator();
		int n = 1;
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
	}
}
