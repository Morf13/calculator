package calculator;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			if (scanner.hasNextInt()) {
				Counter counter = new Counter(new IntegerCalculator());
				System.out.println(counter.calculate(scanner.nextLine()));
			} else {
				Counter counter = new Counter(new RomanCalculator());
				System.out.println(counter.calculate(scanner.nextLine()));
			}

		}
		scanner.close();
	}

}
