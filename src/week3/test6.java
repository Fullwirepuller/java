package example;

import java.util.Scanner;

public class test6 { // 两个整数的输出
	public static int score[];

	public static void main(String[] args) {
		int score[] = null;
		score = new int[2];
		int choose = menu();
		while (choose != 6) {
			switch (choose) {
			case 1:
				intput();
				break;
			case 2:
				oddNumber();
				break;
			case 3:
				evenNumberSum();
				break;
			case 4:
				numberSquare();
				break;
			case 5:
				oddNumberSquareSum();
				break;
			}
			choose = menu();
		}
		System.out.println("");
	}

	public static int menu() {// 菜單
		int choose;
		System.out.println("1.输入两个整数");
		System.out.println("2.输出两个整数之间的奇数");
		System.out.println("3.输出两个整数之间的偶数之和");
		System.out.println("4.输出数字1到10及平方");
		System.out.println("5.输出两个整数之间的奇数平方和");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}

	public static void intput() {// 输入两个整数firstNumber和secondNumber
		score = new int[2];
		Scanner scan = new Scanner(System.in);
		System.out.print("输入第一个数：");
		score[0] = scan.nextInt();
		System.out.print("输入第二个数：");
		score[1] = scan.nextInt();
	}

	public static void oddNumber() {// 输出之间的奇数
		System.out.println("两个数之间的奇数为：");
		for (int i = score[0]; i <= score[1]; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
	}

	public static void evenNumberSum() {// 输出之间的偶数和
		int sum = 0;
		for (int i = score[0]; i <= score[1]; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("所有的偶数和为：" + sum);
	}

	public static void numberSquare() {// 输出数字1到10及平方
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
			sum += (int) Math.pow(i, 2);
		}
		System.out.println();
		System.out.println("1到10所有数字的平方和为:" + sum);
	}

	public static void oddNumberSquareSum() {// 输出之间的奇数平方和
		int sum = 0;
		for (int i = score[0]; i <= score[1]; i++) {
			if (i % 2 != 0) {
				sum += (int) Math.pow(i, 2);
			}
		}
		System.out.println("所有奇数的平方和为：" + sum);
	}
}
