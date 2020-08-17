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
	
	private static Map< Integer, String> numbersRoman = new HashMap<Integer, String>() {
		{
			put(1,"I");
			put(2,"II");
			put(3, "III");
			put(4, "IV");
			put(5, "V");
			put(6, "VI");
			put(7, "VII");
			put(8, "VIII");
			put(9, "IX");
			put(10, "X");
		}
	};

	public static boolean checkIfRoman(String s) {
		if (romanNumbers.containsKey(s))
			return true;
		return false;

	}

	public static String getRoman(int i) {
		return numbersRoman.get(i);

	}
	public static int getInt(String s) {
		return romanNumbers.get(s);

	}
	
	public static void checkRange(int i) throws Exception {
		if(i <= 0 || i > 10) throw new Exception("Only numbers from 1 to 10");
	}
	
	public static void checkRomanRange(String s) throws Exception {
		if(!checkIfRoman(s)) throw new Exception("Only numbers from I to X");
	}
	
	


}
