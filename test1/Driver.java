package Express;

import java.util.Scanner;
import Express.Validate;

public class Driver {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choose = menu();
		while (choose != 12) {
			System.out.println("请输入所需校验的数据：");
			String info = scan.nextLine();
			switch (choose) {
			case 1:
				Validate.username(info);break;
			case 2:
				Validate.Password(info);break;
			case 3:
				Validate.phoneNumber(info);break;
			case 4:
				Validate.tel(info);break;
			case 5:
				Validate.QQ(info);break;
			case 6:
				Validate.ID(info);break;
			case 7:
				Validate.postalCode(info);break;
			case 8:
				Validate.Email(info);break;
			case 9:
				Validate.website(info);break;
			case 10:
				Validate.birthday(info);break;
			case 11:
				Validate.Chinese(info);break;
			default:
				System.out.println("请重新输入");
				break;
			}
			choose = menu();
		}
		System.out.println("欢迎下次使用");
	}
	
	public static int menu() {
		int choose = 0;
		System.out.println("=========数据校验===========");
		System.out.println("1.用户名");
		System.out.println("2.密码");
		System.out.println("3.手机号码");
		System.out.println("4.电话号码");
		System.out.println("5.QQ号码");
		System.out.println("6.身份证号");
		System.out.println("7.邮政编码");
		System.out.println("8.Email");
		System.out.println("9.website");
		System.out.println("10.出生日期");
		System.out.println("11.中文名");
		System.out.println("please choose(1-11)");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}

}
