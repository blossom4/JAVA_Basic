package chapter3;

public class OperationEx4 {

	public static void main(String[] args) {
		
		int num1 = 10;
		
		System.out.println(num1 += 1);
		System.out.println(num1 %= 10);
		num1 -= 1;
		System.out.println(num1);
		
		@SuppressWarnings("unused")
		int num2 = (5 > 3) ? 10 : 20;
		System.out.println(num2);
	}

}
