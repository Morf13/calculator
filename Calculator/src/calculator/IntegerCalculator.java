package calculator;

public class IntegerCalculator extends Calculator {

	@Override
	public String add(String x, String y) {
		
		return "" + (Integer.parseInt(x) + Integer.parseInt(y));
	}

	@Override
	public String divide(String x, String y) {
		return "" + (Integer.parseInt(x) / Integer.parseInt(y));
	}

	@Override
	public String multiply(String x, String y) {
		return "" + (Integer.parseInt(x) * Integer.parseInt(y));
	}

	@Override
	public String subtract(String x, String y) {
		return "" + (Integer.parseInt(x) - Integer.parseInt(y));
	}

	

}
