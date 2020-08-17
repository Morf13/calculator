package calculator;

public class RomanCalculator extends Calculator{

	@Override
	public String add(String x, String y) {
		
		return Parser.getRoman(Parser.getInt(x) + Parser.getInt(y));
	}

	@Override
	public String divide(String x, String y) {
		return Parser.getRoman(Parser.getInt(x) / Parser.getInt(y));
	}

	@Override
	public String multiply(String x, String y) {
		return Parser.getRoman(Parser.getInt(x) * Parser.getInt(y));
	}

	@Override
	public String subtract(String x, String y) {
		if(Parser.getInt(x) - Parser.getInt(y) < 0) return "-" + Parser.getRoman(Math.abs(Parser.getInt(x) - Parser.getInt(y)));
		if(Parser.getInt(x) - Parser.getInt(y) == 0) return "" + 0;
		return Parser.getRoman(Parser.getInt(x) - Parser.getInt(y));
	}

}
