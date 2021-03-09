package example;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		final int ONE_DOLLARS = 100;
		final int FIFTY_CENT_COINS = 50;
		final int TWENTY_CENT_COINS = 20;
		final int TEN_CENT_COINS = 10;
		final int FIVE_CENT_COINS = 5;
		final int TWO_CENT_COINS = 2;
		final int ONE_CENT_COINS = 1;
		float money;
		float MONEY;
		int dollarsNumber;
		int fiftyCentNumber;
		int twentyCentNumber;
		int tenCentNumber;
		int fiveCentNumber;
		int twoCentNumber;
		int oneCentNumber;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入美元的大小：");
		money = scan.nextFloat();

		MONEY = 100 * money;
		dollarsNumber = (int) MONEY / 100;
		fiftyCentNumber = (int) (MONEY % 100) / 50;
		twentyCentNumber = (int) ((MONEY % 100) % 50) / 20;
		tenCentNumber = (int) (((MONEY % 100) % 50) % 20) / 10;
		fiveCentNumber = (int) ((((MONEY % 100) % 50) % 20) % 10) / 5;
		twoCentNumber = (int) (((((MONEY % 100) % 50) % 20) % 10) % 5) / 2;
		oneCentNumber = (int) ((((((MONEY % 100) % 50) % 20) % 10) % 5) % 2) / 1;

		System.out.println("1美元的数量：" + dollarsNumber);
		System.out.println("50美分的数量：" + fiftyCentNumber);
		System.out.println("20美分的数量：" + twentyCentNumber);
		System.out.println("10美分的数量：" + tenCentNumber);
		System.out.println("5美分的数量：" + fiveCentNumber);
		System.out.println("2美分的数量：" + twoCentNumber);
		System.out.println("1美分的数量：" + oneCentNumber);
	}
}
