package algorithim;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ipaddObject extends IPAddressValidator {

	private static String pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
								  + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
								  + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
								  + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	private Pattern patternObj;
	private Matcher matcherObj;
	private String Ip = "";

	public ipaddObject(String ip) {
		patternObj = Pattern.compile(pattern);
		setIp(ip);
	}

	public boolean isMatch() {
		matcherObj = this.patternObj.matcher(Ip);
		boolean result = this.matcherObj.matches();
		return result;
	}

	public String getIp() {
		return Ip;
	}

	public void setIp(String ip) {
		this.Ip = ip;
	}

}
