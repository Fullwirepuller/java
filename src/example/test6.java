package example;

import java.util.Scanner;

public class test6 {
	public static void main(String[] args) {
		int max;// ����

		Scanner scan = new Scanner(System.in);
		System.out.println("������Ҫ��ӡ��������");
		max = scan.nextInt();

		for (int i = 1; i <= max; i++) { // ������
			for (int j = 1; j <= max - i; j++) { // ���ƿո�
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) { // ����"*"��
				System.out.print("* ");
			}
			System.out.print("\n"); // ����
		}
	}
}
