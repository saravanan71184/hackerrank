package algorithim;

public class test {

	public static void main(String[] args) {
		int[] a = {1} ;
		test t = new test() ;
		t.increment(a);
		System.out.println(a[a.length -1]) ;

	}
	void increment(int[] i) {
		i[i.length -1]++ ;
	}

}
