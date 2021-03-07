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

		System.out.println("请输入饼干的数量：");
		biscuitsNumber = scan.nextInt();

		boxNumber = biscuitsNumber / BISCUITS_BOX;
		containerNumber = boxNumber / BOX_CONTAINER;
		leftoverBiscuitsNumber = biscuitsNumber % BISCUITS_BOX;
		leftoverBoxesNumber = boxNumber % BOX_CONTAINER;

		System.out.println("盒子的数量：" + boxNumber);
		System.out.println("容器的数量：" + containerNumber);
		System.out.println("剩余饼干的数量：" + leftoverBiscuitsNumber);
		System.out.println("剩余盒子的数量：" + leftoverBoxesNumber);

	}
}
