package example;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final int BISCUITS_BOX = 24;
		final int BOX_CONTAINER = 75;
		int biscuitsNumber;
		int boxNumber;
		int containerNumber;
		int leftoverBiscuitsNumber;
		int leftoverBoxesNumber;

		System.out.println("��������ɵ�������");
		biscuitsNumber = scan.nextInt();

		boxNumber = biscuitsNumber / BISCUITS_BOX;
		containerNumber = boxNumber / BOX_CONTAINER;
		leftoverBiscuitsNumber = biscuitsNumber % BISCUITS_BOX;
		leftoverBoxesNumber = boxNumber % BOX_CONTAINER;

		System.out.println("���ӵ�������" + boxNumber);
		System.out.println("������������" + containerNumber);
		System.out.println("ʣ����ɵ�������" + leftoverBiscuitsNumber);
		System.out.println("ʣ����ӵ�������" + leftoverBoxesNumber);

	}
}
