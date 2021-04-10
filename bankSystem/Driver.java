package bankSystem;

import java.util.Scanner;

public class Driver {
	public static Customer customer = null;
	public static SavingAccount sa = null;
	public static CheckingAccount ca = null;
	public static double quota;
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int choose = menu();
		while (choose != 8) {
			switch (choose) {
			case 1:
				createAccount();
				break;
			case 2:
				save();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				comsume();
				break;
			case 5:
				repay();
				break;
			case 6:
				settle();
				break;
			case 7:
				balance();
				break;
			default:
				break;
			}
			choose = menu();
		}
		System.out.println("ллʹ�ô�ϵͳ��");
	}

	public static int menu() {// ���˵�
		Scanner scan = new Scanner(System.in);
		System.out.println("��ӭʹ������ϵͳ");
		System.out.println("1.����");
		System.out.println("2.���");
		System.out.println("3.ȡ��");
		System.out.println("4.����");
		System.out.println("5.����");
		System.out.println("6.���н���");
		System.out.println("7.��ѯ���");
		System.out.println("8.�˳�");
		int choose = scan.nextInt();
		return choose;
	}

	public static void createAccount() {// ����
		int choose = submenu();
		while (choose != 3) {
			switch (choose) {
			case 1:
				createCheckingAccount();
				break;
			case 2:
				createSavingAccount();
				break;
			default:
				break;
			}
			choose = submenu();
		}
	}

	public static int submenu() {// ���˵�
		System.out.println("��ѡ�񿪿����ͣ�");
		System.out.println("1.���ÿ�");
		System.out.println("2.���");
		System.out.println("3.����");
		int choose = scan.nextInt();
		return choose;
	}

	public static void createSavingAccount() {// ��ͨ�洢���˻�
		System.out.println("���������֤�ţ�");
		String ssn = scan.next();
		System.out.println("���������֣�");
		String name = scan.next();
		System.out.println("�����뿨�ţ�");
		String accountNumSa = scan.next();
		System.out.println("���������ʣ�");
		double rate = scan.nextDouble();
		System.out.println("��ϲ�㿪ͨ�洢���ɹ���");

		sa = new SavingAccount(accountNumSa, 0, rate);
		customer = new Customer(ssn, name, sa, null);
	}

	public static void createCheckingAccount() {// ��ͨ���ÿ��˻�
		System.out.println("���������֤�ţ�");
		String ssn = scan.next();
		System.out.println("���������֣�");
		String name = scan.next();
		System.out.println("�����뿨�ţ�");
		String accountNumCa = scan.next();
		System.out.println("���������ѣ�");
		double fee = scan.nextDouble();
		System.out.println("��ϲ�㿪ͨ���ÿ��ɹ���");

		ca = new CheckingAccount(accountNumCa, 0, fee);
		customer = new Customer(ssn, name, null, ca);
	}

	public static void save() {// ���
		if (sa == null) {
			System.out.println("���ȿ�ͨ�洢���˻�");
			return;
		}
		System.out.println("���������");
		double money = scan.nextDouble();
		sa.setBalance(sa.getBalance() + money);
		System.out.println("���ɹ�");
	}

	public static void withdraw() {// ȡ��
		if (sa == null) {
			System.out.println("���ȿ�ͨ�洢���˻�");
			return;
		}
		System.out.println("������ȡ���");
		double money = scan.nextDouble();
		if (money > sa.getBalance()) {
			System.out.println("���㣬���ȡ���" + sa.getBalance());
		} else {
			System.out.println("����㹻ȡ��ɹ���");
			sa.setBalance(sa.getBalance() - money);
			System.out.println("ȡ������Ϊ��" + sa.getBalance());
		}
	}

	public static void comsume() {// ����
		if (ca == null) {
			System.out.println("���ȿ�ͨ���ÿ��˻�");
			return;
		}
		System.out.println("�������ÿ��Ķ��Ϊ:");
		quota = scan.nextDouble();
		ca.setBalance(quota);
		System.out.println("����������ˢ����");
		double money = scan.nextDouble();
		ca.setBalance(ca.getBalance() - money);
		System.out.println("���ѳɹ���");
	}

	public static void repay() {// ����
		if (ca == null) {
			System.out.println("���ȿ�ͨ���ÿ��˻�");
			return;
		}
		System.out.println("����Ҫ����Ľ��Ϊ��" + (quota - ca.getBalance()));
		System.out.println("�����뱾�λ���Ľ�");
		double money = scan.nextDouble();
		if(money>(quota - ca.getBalance())) {
			System.out.println("������������������뻹���");
			money = scan.nextDouble();
		}
		ca.setBalance(ca.getBalance() + money);
		System.out.println("ʣ��Ļ�����Ϊ��" + (quota - ca.getBalance()));
		System.out.println("����ɹ���");
	}

	public static void settle() {// ����
		if (ca == null) {
			System.out.println("�������ÿ����޷��������ѣ�");
		} else {
			System.out.println("���ÿ�����ѽ���ɹ���");
			System.out.println("�����Ϊ��"+ca.getServiceFee());
			ca.assessServiceCharge();
		}
		if (sa == null) {
			System.out.println("���޴洢�����޷��������ʣ�");
		} else {
			System.out.println("�洢�����ʽ���ɹ���");
			System.out.println("��ϢΪ��"+(sa.getBalance()*sa.getInterestRate()));
			sa.payInterest();
		}

	}

	public static void balance() {// ��ѯ���
		if (ca == null) {
			System.out.println("�������ÿ����޷���ѯ���ÿ����");
		} else {
			System.out.println("���ÿ���" + ca.getBalance());
		}
		if (sa == null) {
			System.out.println("���޴洢�����޷���ѯ�洢�����");
		} else {
			System.out.println("�洢����" + sa.getBalance());
		}

	}
}
