import java.util.Scanner;

public class Input {
	static int getFirstValue(Scanner scanner) {
		System.out.println("첫 번째 입력 값: ");
		int first = scanner.nextInt();
		System.out.println(first);
		return first;
	}

	static int getSecondValue(Scanner scanner) {
		System.out.println("두 번째 입력 값: ");
		int second = scanner.nextInt();
		System.out.println(second);
		return second;
	}

	static String getSymbol(Scanner scanner) {
		System.out.println("기호 : (종료: quit)");
		String symbol = scanner.next();
		System.out.println(symbol);
		return symbol;
	}
}