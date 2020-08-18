package calculator;

public class RomanCalculator extends Calculator{

	@Override
	public String add(String x, String y) {
		
		return Converter.intToRoman(Converter.romanToInt(x) + Converter.romanToInt(y));
	}

	@Override
	public String divide(String x, String y) {
		return Converter.intToRoman(Converter.romanToInt(x) / Converter.romanToInt(y));
	}

	@Override
	public String multiply(String x, String y) {
		return Converter.intToRoman(Converter.romanToInt(x) * Converter.romanToInt(y));
	}

	@Override
	public String subtract(String x, String y) {
		if(Converter.romanToInt(x) - Converter.romanToInt(y) < 0) return "-" + Converter.intToRoman(Math.abs(Converter.romanToInt(x) - Converter.romanToInt(y)));
		if(Converter.romanToInt(x) - Converter.romanToInt(y) == 0) return "" + 0;
		return Converter.intToRoman(Converter.romanToInt(x) - Converter.romanToInt(y));
	}

}
