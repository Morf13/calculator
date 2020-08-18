package calculator;
import java.util.HashMap;
import java.util.Map;

public class Parser {
	private static Map<String, Integer> romanNumbers = new HashMap<String, Integer>() {
		{
			put("I", 1);
			put("II", 2);
			put("III", 3);
			put("IV", 4);
			put("V", 5);
			put("VI", 6);
			put("VII", 7);
			put("VIII", 8);
			put("IX", 9);
			put("X", 10);
		}
	};
	
	
	public static boolean checkIfRoman(String s) {
		if (romanNumbers.containsKey(s))
			return true;
		return false;

	}
	
	public static void checkRange(int i) throws Exception {
		if(i <= 0 || i > 10) throw new Exception("Only numbers from 1 to 10");
	}
	
	public static void checkRomanRange(String s) throws Exception {
		if(!checkIfRoman(s)) throw new Exception("Only numbers from I to X");
	}
	
	


}
