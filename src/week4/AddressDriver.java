package week4;
import java.util.Scanner;

public class AddressDriver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Address add = new Address();
		System.out.println("��������ҵ���Ϣ��");
		String country = scan.next();
		add.setCountry(country);
		System.out.println("������ʡ�ݵ���Ϣ��");
		String province = scan.next();
		add.setProvince(province);
		System.out.println("��������е���Ϣ��");
		String city = scan.next();
		add.setCity(city);
		System.out.println("������ֵ�����Ϣ��");
		String street = scan.next();
		add.setStreet(street);
		System.out.println("�������ʱ����Ϣ��");
		int Postcode = scan.nextInt();
		add.setPostcode(Postcode);
		String address = add.toString();
		System.out.println(address);

	}

}
