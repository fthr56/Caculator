import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		// System.out.println("덧셈: " + (3+4));
		// System.out.println("뺄셈: " + (4-1));
		// System.out.println("곱셈: " + (3*4));
		// System.out.println("나눗셈: " + (4/3));

		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 입력 값: ");
		int first = scanner.nextInt();
		System.out.println(first);

		// TODO 두 번째 값을 입력 받아 저장
		System.out.println("두 번째 입력 값: ");
		int second = scanner.nextInt();
		System.out.println(second);

		// TODO 입력 받은 두 값에 대한 사칙연산을 계산해 출력
		System.out.println("계산할 사칙연산을 입력: ");
		String operator = scanner.next();
		int result;
		if (operator.equals("+")) {
			result = first + second;
		} else if(operator.equals("-")){
			result = first - second;
		} else if(operator.equals("*")){
			result = first * second;
		} else if(operator.equals("/")){
			result = first / second;
		} else{
			result = 0;								//잘못됐을때 일단 결과값을 0으로 만듬
			System.out.println("잘못 입력 하셨습니다.");
		}
		System.out.println("계산 값은: " + result);

		scanner.close();
	}
}
