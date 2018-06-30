package karteekwayfairprep;

import java.io.*;
import java.util.*;

class balancedBrackets {

	static class stack {
		int top = -1;
		char items[] = new char[100];

		void push(char x) {
			if (top == 99) {
				System.out.println("Stack full");
			} else {
				items[++top] = x;
			}
		}

		char pop() {
			if (top == -1) {
				System.out.println("Underflow error");
				return '\0';
			} else {
				char element = items[top];
				top--;
				return element;
			}
		}

		boolean isEmpty() {
			return (top == -1) ? true : false;
		}
	}

	/*
	 * Returns true if character1 and character2 are matching left and right
	 * Parenthesis
	 */
	static boolean isMatchingPair(char character1, char character2) {
		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}

	/*
	 * Return true if expression has balanced Parenthesis
	 */
	static boolean areParenthesisBalanced(char exp[]) {

		stack st = new stack();

		for (int i = 0; i < exp.length; i++) {

			if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[') {
				st.push(exp[i]);
			}
			else if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {

				if (st.isEmpty()) {
					return false;
				} 
				else 
				{
					char a = st.pop();
					boolean b = isMatchingPair(a, exp[i]);
					if (b == false) {
						return false;
					}
				}
			}

		}

		/*
		 * If there is something left in expression then there is a starting parenthesis
		 * without a closing parenthesis
		 */

		if (st.isEmpty())
			return true; /* balanced */
		else { /* not balanced */
			return false;
		}
	}

	public static void main(String[] args) {
		String input = "}}{{{()()}}}";
		char exp[] = input.toCharArray();// {'{','(',')','}','[',']'};
		if (areParenthesisBalanced(exp))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}

}

/*
 * boolean invalidString = false ;
 * 
 * String input = "{{[[(())]]}}"; int lengthOfInput = input.length()/2; int
 * endIndex = lengthOfInput -1 ; if(input.length() % 2 == 0){ for(int i=0;
 * i<lengthOfInput; i++){ System.out.println("inside if"); if(( input.charAt(i)
 * == '{' && input.charAt(endIndex) == '}') || (input.charAt(i) == '[' &&
 * input.charAt(endIndex) == ']' ) || (input.charAt(i) == '(' &&
 * input.charAt(endIndex) == ')' ) ){
 * 
 * invalidString = true ; }else{ invalidString = false ; return invalidString ;
 * }
 * 
 * endIndex--; }
 * 
 * }
 * 
 * return invalidString ;
 */
/*
 * }
 * 
 * public static void main(String[] args){ balancedBrackets s= new
 * balancedBrackets() ; boolean sss = s.testmethod() ; System.out.println(sss) ;
 * }
 * 
 */
