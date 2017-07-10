import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 입력 값: ");
		int first = scanner.nextInt();
		System.out.println(first);

		System.out.println("사칙연산 기호: ");
		String symbol = scanner.next();
		
		System.out.println("두 번째 입력 값: ");
		int second = scanner.nextInt();
		System.out.println(second);

		if(symbol.equals("+")) {
				System.out.printf("덧셈 : %d", first+second);
		} else if (symbol.equals("-")) {
			System.out.printf("뺄셈 : %d", first-second);
		} else if (symbol.equals("*")) {
			System.out.printf("곱셈 : %d", first*second);
		} else if (symbol.equals("/")) {
			System.out.printf("나눗셈 : %d", first/second);
		} else {
		  System.out.println("사칙연산에 해당하지 않는 값을 입력했습니다.");
		}
		scanner.close();
	}
}
