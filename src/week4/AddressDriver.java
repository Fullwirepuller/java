package week4;
import java.util.Scanner;

public class AddressDriver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Address add = new Address();
		System.out.println("请输入国家的信息：");
		String country = scan.next();
		add.setCountry(country);
		System.out.println("请输入省份的信息：");
		String province = scan.next();
		add.setProvince(province);
		System.out.println("请输入城市的信息：");
		String city = scan.next();
		add.setCity(city);
		System.out.println("请输入街道的信息：");
		String street = scan.next();
		add.setStreet(street);
		System.out.println("请输入邮编的信息：");
		int Postcode = scan.nextInt();
		add.setPostcode(Postcode);
		String address = add.toString();
		System.out.println(address);

	}

}
