package thirtyDaysofCode;


public class Difference {
	private int[] elements;
	public int maximumDifference;

	public Difference(int[] a) {
		
			this.elements = a ;
		

	}

	public int computeDifference() {

		int smallestElement = this.elements[0];
		for (int i = 0; i < this.elements.length; i++) {
			if (this.elements[i] < smallestElement) {
				smallestElement = this.elements[i];
			}
		}
		int largestElement = elements[0];
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] > largestElement) {
				largestElement = elements[i];
			}

			maximumDifference = Math.subtractExact(largestElement, smallestElement);
		}
		return maximumDifference;
	}

	public static void main(String[] args) {
		int[] a = { 5, 3, 1 };

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);

	}

}
