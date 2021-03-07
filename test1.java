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

		System.out.println("请输入歌曲的名称：");
		songTitle = scan.nextLine();
		System.out.println("请输入单价：");
		songprice = scan.nextFloat();
		System.out.println("请输入数量：");
		number = scan.nextInt();

		totalRevence = songprice * number;
		siteRevence = totalRevence * SITE_RATE;
		manageRevence = totalRevence * MANAGE_RATE;

		System.out.println("总利润：" + totalRevence);
		System.out.println("经理利润：" + manageRevence);
		System.out.println("站点利润：" + siteRevence);
	}
}
