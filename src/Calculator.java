import java.util.Scanner;

public class Calculator {

	static int calculate(String symbol, int first, int second) {
		int result = first;
		if (symbol.equals("+")) {
			result = result + second;
			System.out.println("덧셈 : " + result);
		} else if (symbol.equals("-")) {
			result = result - second;
			System.out.println("뺄셈 : " + result);
		} else if (symbol.equals("*")) {
			result = result * second;
			System.out.println("곱셈 : " + result);
		} else if (symbol.equals("/")) {
			result = result / second;
			System.out.println("나눗셈 : " + result);
		} else {
			System.out.println("사칙연산 기호가 아닙니.");
		}
		return result;
	}

	public static void main(String[] args) {
		
		Input input = new Input();
		Output output = new Output();
		Scanner scanner = new Scanner(System.in);

		int result = input.getFirstValue(scanner);

		while (true) {
			String symbol = input.getSymbol(scanner);

			if ("quit".equals(symbol)) {
				output.print(result);
				break;
			}

			int second = input.getSecondValue(scanner);

			result = calculate(symbol, result, second);
		}

		scanner.close();
	}
}
