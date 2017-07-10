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

			if ("quit".equals(symbol)) {
				// TODO 최종 실행 결과 값 출력
				System.out.printf("계산 결과 : %d", result);
				break;
			} 
			
			System.out.println("다음 값 입력: ");
			next = scanner.nextInt();
			System.out.println(next);
			
			// TODO 사칙연산 실행			
			if (symbol.equals("+")) {
				result += next;
			} else if (symbol.equals("-")) {
				result -= next;
			} else if (symbol.equals("*")) {
				result *= next;
			} else if (symbol.equals("/")) {
				result /= next;
			} else {
				System.out.println("사칙연산에 해당하지 않는 값을 입력했습니다.");
			}
		}
		
		scanner.close();

	}
}
