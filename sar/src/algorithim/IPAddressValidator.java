package algorithim;


public class IPAddressValidator {

	public static void main(String[] args) {
		String[] addr = { "000.12.12.034", "err.ghgh.ghghg.ggg" ,"34.34.34.355" , "255.255.255.255"};
		for(int i=0; i<addr.length; i++) {
		ipaddObject sdasd = new ipaddObject(addr[i]) ;
		System.out.println(sdasd.isMatch()) ;
	}
	}
}

