import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 입력 값: ");
		int first = scanner.nextInt();
		System.out.println(first);

		int result = first;
		int next;
		String symbol;

		while (true) {
			System.out.println("기호 : (종료: quit)");
			symbol = scanner.next();
			System.out.println(symbol);

			if (symbol.equals("quit")) {
				System.out.printf("최종 결과 값 : %d", result);
				break;
			}

			System.out.println("두 번째 입력 값: ");
			int second = scanner.nextInt();
			System.out.println(second);

			// TODO 사칙연산 실행
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
				System.out.println("사칙연산 기호가 아닙니다.");
			}
		}

		scanner.close();

	}
}
