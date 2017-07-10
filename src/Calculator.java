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
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("계산 할 수식을 입력 하시요.(사칙연산만 인정)");
		String value = scanner.nextLine();
		String[] values = value.split(" ");
		//문자열을 입력 받은 후(scanner의 nextLine() 메소드 활용) 빈 공백 문자열을 기준으로 문자들을 분리해야 한다.
		// 3 + 2 + 1 을 보면 알다시피 홀수 위치엔 숫자, 짝수 위치엔 연산자가 온다.(인덱스는 0 부터니 0부터 짝수엔 숫자, 1부터 홀수엔 연산자)
		
		//첫번째 위치엔 숫자가 들어가니 그 값으로 초기화를 해줌 
		int result = Integer.parseInt(values[0]);
		for(int i=1; i<values.length; i+=2){
			//인덱스가 1부터 시작하니 연산자가 들어있고 +2를 해줌으로 i의 값엔 연산자만 계속 진행된다.
			//i+1은 연산자 다음 숫자가 지속적으로 나오게 된다. 
			result = calculate(values[i], result, Integer.parseInt(values[i+1]));
		}
		//결과 출력
		Output.print(result);

		scanner.close();
	}
}
