import java.util.Scanner;

public class Calculator {

	static int getFirstValue(Scanner scanner) {
		// TODO 첫 번째 값을 입력 받아 반환
		System.out.println("첫 번째 입력 값: ");
		int first = scanner.nextInt();
		System.out.println(first);
		return first;
	}

	static int getSecondValue(Scanner scanner) {
		// TODO 두 번째 값을 입력 받아 반환
		System.out.println("두 번째 입력 값: ");
		int second = scanner.nextInt();
		System.out.println(second);
		return second;
	}

	static String getSymbol(Scanner scanner) {
		// TODO 첫 번째 값을 입력 받아 반환
		System.out.println("기호 : (종료: quit)");
		String symbol = scanner.next();
		System.out.println(symbol);
		return symbol;
	}

	static int calculate(String symbol, int first, int second) {
		// TODO 사칙 연산을 계산해 결과 값을 반환
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

	static void print(int result) {
		// TODO 실행 결과를 출력
		System.out.printf("최종 결과 값 : %d", result);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int result = getFirstValue(scanner);

		while (true) {
			String symbol = getSymbol(scanner);

			if ("quit".equals(symbol)) {
				print(result);
				break;
			}

			int second = getSecondValue(scanner);

			result = calculate(symbol, result, second);
		}

		scanner.close();
	}
}
