package example;

import java.util.Scanner;

public class test5 {
	public static void main(String[] args) {
		int number;
		int i = 1;
		int firstNumber = 1;
		int endNumber;
		int everyNumber;
		int numberPow;

		Scanner scan = new Scanner(System.in);
		System.out.println("������һ��nλ����������");
		number = scan.nextInt();

		while (i < number) {
			firstNumber *= 10;
			i++;
		}
		endNumber = firstNumber * 10;
		for (i = firstNumber; i < endNumber; i++) {
			int t = i;
			int sum = 0;
			do {
				everyNumber = t % 10;
				t /= 10;
				numberPow = (int) Math.pow(everyNumber, number);
				sum += numberPow;
			} while (t > 0);
			if (sum == i) {
				System.out.println(+sum);
			}
		}
	}
}
