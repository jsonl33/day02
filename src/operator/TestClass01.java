package operator;

import java.util.Scanner;

public class TestClass01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = sc.nextInt();
		String s = (num%2==0)?"짝수":"홀수";
		System.out.println(num+"는 "+s);
		
		String th = (num%3==0)?"3의배수":"3의배수가 아님";
		System.out.println(num+"는 "+th);
		sc.close();
	}
}
