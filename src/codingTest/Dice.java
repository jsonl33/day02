package codingTest;

import java.util.Scanner;

public class Dice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int first = 0;
		int second = 0;
		int third = 0;
		
		int num1 = sc.nextInt();
		if (0 < num1 && num1 <= 6) {
			first = num1;
		}
		
		
		int num2 = sc.nextInt();
		if (0 < num2 && num2 <= 6) {
			second = num2;
		}
		int num3 = sc.nextInt();
		if (0 < num3 && num3 <= 6) {
			third = num3;
		}
		
		int price = 0;
		int eq = 0;
		
		if (first == second) {
			eq = first;
		}
		else if (second == third) {
			eq = second;
		}
		else if(first == third) {
			eq = first;
		}
		
		int highest = 0;
		
		if (first > second && first > third) {
			highest = first;
		}
		else if (first < second && second > third) {
			highest = second;
		}
		else if (third > second && first < third) {
			highest = third;
		}
		
		if (first == second && second == third) {
			price = 10000 + eq * 1000;
			System.out.println(price);
		}
		else if (first == second || first == third || second == third) {
			price = 1000 + eq * 100;
			System.out.println(price);
		}
		else {
			price = highest*100;
			System.out.println(price);
		}
	}
}
