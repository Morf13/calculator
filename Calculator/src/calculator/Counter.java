package calculator;

public class Counter {
	private Calculator calculator;
	
	Counter(Calculator calculator){
		this.calculator = calculator;
	}
	
	public String calculate(String input) throws Exception {
		String[] inputArray = input.split(" ");
		String x = inputArray[0];
		String y = inputArray[2];
		String operation = inputArray[1];
		
		if(tryParse(x) != null) Parser.checkRange(Integer.parseInt(x));
		if(tryParse(y) != null) Parser.checkRange(Integer.parseInt(y));
		if(tryParse(x) == null) Parser.checkRomanRange(x);
		if(tryParse(y) == null) Parser.checkRomanRange(y);
		if(tryParse(x) == null && tryParse(y) != null || tryParse(y) == null && tryParse(x) != null) throw new Exception("Only Roman or Only Arabic");
		
		String result;
		switch (operation) {
		case "+":
			result = calculator.add(x, y);
			break;
		case "-":
			result = calculator.subtract(x, y);
			break;

		case "/":
			result = calculator.divide(x, y);
			break;

		case "*":
			result = calculator.multiply(x, y);
			break;
		default:
			throw new Exception("Unknown operation");

		}
		
		return result;

		
	}
	
	
	
	private Integer tryParse(String text) {
		  try {
		    return Integer.parseInt(text);
		  } catch (NumberFormatException e) {
		    return null;
		  }
		}

}
