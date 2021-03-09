package example;

import java.util.Scanner;

public class test6 {
	public static void main(String[] args) {
		int max;// 行数

		Scanner scan = new Scanner(System.in);
		System.out.println("请输入要打印的行数：");
		max = scan.nextInt();

		for (int i = 1; i <= max; i++) { // 控制行
			for (int j = 1; j <= max - i; j++) { // 控制空格
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) { // 控制"*"号
				System.out.print("* ");
			}
			System.out.print("\n"); // 换行
		}
	}
}
