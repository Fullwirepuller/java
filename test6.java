package example;

import java.util.Scanner;

public class test6 { // �������������
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

	public static int menu() {// �ˆ�
		int choose;
		System.out.println("1.������������");
		System.out.println("2.�����������֮�������");
		System.out.println("3.�����������֮���ż��֮��");
		System.out.println("4.�������1��10��ƽ��");
		System.out.println("5.�����������֮�������ƽ����");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}

	public static void intput() {// ������������firstNumber��secondNumber
		score = new int[2];
		Scanner scan = new Scanner(System.in);
		System.out.print("�����һ������");
		score[0] = scan.nextInt();
		System.out.print("����ڶ�������");
		score[1] = scan.nextInt();
	}

	public static void oddNumber() {// ���֮�������
		System.out.println("������֮�������Ϊ��");
		for (int i = score[0]; i <= score[1]; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
	}

	public static void evenNumberSum() {// ���֮���ż����
		int sum = 0;
		for (int i = score[0]; i <= score[1]; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("���е�ż����Ϊ��" + sum);
	}

	public static void numberSquare() {// �������1��10��ƽ��
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
			sum += (int) Math.pow(i, 2);
		}
		System.out.println();
		System.out.println("1��10�������ֵ�ƽ����Ϊ:" + sum);
	}

	public static void oddNumberSquareSum() {// ���֮�������ƽ����
		int sum = 0;
		for (int i = score[0]; i <= score[1]; i++) {
			if (i % 2 != 0) {
				sum += (int) Math.pow(i, 2);
			}
		}
		System.out.println("����������ƽ����Ϊ��" + sum);
	}
}
