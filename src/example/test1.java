package example;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final float SITE_RATE = 0.03f;
		final float MANAGE_RATE = 0.12f;
		String songTitle;
		float songprice;
		int number;
		float totalRevence;
		float manageRevence;
		float siteRevence;

		System.out.println("��������������ƣ�");
		songTitle = scan.nextLine();
		System.out.println("�����뵥�ۣ�");
		songprice = scan.nextFloat();
		System.out.println("������������");
		number = scan.nextInt();

		totalRevence = songprice * number;
		siteRevence = totalRevence * SITE_RATE;
		manageRevence = totalRevence * MANAGE_RATE;

		System.out.println("������" + totalRevence);
		System.out.println("��������" + manageRevence);
		System.out.println("վ������" + siteRevence);
	}
}
