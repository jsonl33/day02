package codingTest;

import java.util.Scanner;

public class Quadrant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (0 < x) {
			if(0 < y) {
				System.out.println(1);
			}
			else if (0 > y) {
				System.out.println(4);
			}
		}
		else if (0 > x) {
			if(0 < y) {
				System.out.println(2);
			}
			else if (0 > y) {
				System.out.println(3);
			}
		}
	}
}