package calculator;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Converter {
	private static final Map<Character, Integer> romanToIntegerMap = new HashMap<>(7);
	static {
		romanToIntegerMap.put('I', 1);
		romanToIntegerMap.put('V', 5);
		romanToIntegerMap.put('X', 10);
		romanToIntegerMap.put('L', 50);
		romanToIntegerMap.put('C', 100);
		romanToIntegerMap.put('D', 500);
		romanToIntegerMap.put('M', 1000);
	}
	 
	public static int romanToInt(String s) {
	    int sum = 0;
	    int len = s.length() - 1;
	    for (int i = 0; i < len; i++) {
	        if (romanToIntegerMap.get(s.charAt(i)) < romanToIntegerMap.get(s.charAt(i + 1))) {
	            sum -= romanToIntegerMap.get(s.charAt(i));
	        } else {
	            sum += romanToIntegerMap.get(s.charAt(i));
	        }
	    }
	    return sum += romanToIntegerMap.get(s.charAt(len));
	}
	
	private static final TreeMap<Integer, String> integerToRomanMap = new TreeMap<>(Collections.reverseOrder());
	static {
		integerToRomanMap.put(1000, "M");
		integerToRomanMap.put(900, "CM");
		integerToRomanMap.put(500, "D");
		integerToRomanMap.put(400, "CD");
		integerToRomanMap.put(100, "C");
		integerToRomanMap.put(90, "XC");
		integerToRomanMap.put(50, "L");
		integerToRomanMap.put(40, "XL");
		integerToRomanMap.put(10, "X");
		integerToRomanMap.put(9, "IX");
		integerToRomanMap.put(5, "V");
		integerToRomanMap.put(4, "IV");
		integerToRomanMap.put(1, "I");
	}
	public static String intToRoman(int num) {
	    StringBuilder roman = new StringBuilder("");
	    for (Integer i: integerToRomanMap.keySet()) {
	        for (int j = 1; j <= num / i; j++) {
	            roman.append(integerToRomanMap.get(i));
	        }
	        num %= i;
	    }
	    return roman.toString();
	}

}
