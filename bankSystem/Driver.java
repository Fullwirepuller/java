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
		System.out.println("谢谢使用此系统！");
	}

	public static int menu() {// 主菜单
		Scanner scan = new Scanner(System.in);
		System.out.println("欢迎使用银行系统");
		System.out.println("1.开户");
		System.out.println("2.存款");
		System.out.println("3.取款");
		System.out.println("4.消费");
		System.out.println("5.还款");
		System.out.println("6.银行结算");
		System.out.println("7.查询余额");
		System.out.println("8.退出");
		int choose = scan.nextInt();
		return choose;
	}

	public static void createAccount() {// 开户
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

	public static int submenu() {// 副菜单
		System.out.println("请选择开卡类型：");
		System.out.println("1.信用卡");
		System.out.println("2.储蓄卡");
		System.out.println("3.返回");
		int choose = scan.nextInt();
		return choose;
	}

	public static void createSavingAccount() {// 开通存储卡账户
		System.out.println("请输入身份证号：");
		String ssn = scan.next();
		System.out.println("请输入名字：");
		String name = scan.next();
		System.out.println("请输入卡号：");
		String accountNumSa = scan.next();
		System.out.println("请输入利率：");
		double rate = scan.nextDouble();
		System.out.println("恭喜你开通存储卡成功！");

		sa = new SavingAccount(accountNumSa, 0, rate);
		customer = new Customer(ssn, name, sa, null);
	}

	public static void createCheckingAccount() {// 开通信用卡账户
		System.out.println("请输入身份证号：");
		String ssn = scan.next();
		System.out.println("请输入名字：");
		String name = scan.next();
		System.out.println("请输入卡号：");
		String accountNumCa = scan.next();
		System.out.println("请输入服务费：");
		double fee = scan.nextDouble();
		System.out.println("恭喜你开通信用卡成功！");

		ca = new CheckingAccount(accountNumCa, 0, fee);
		customer = new Customer(ssn, name, null, ca);
	}

	public static void save() {// 存款
		if (sa == null) {
			System.out.println("请先开通存储卡账户");
			return;
		}
		System.out.println("请输入存款金额：");
		double money = scan.nextDouble();
		sa.setBalance(sa.getBalance() + money);
		System.out.println("存款成功");
	}

	public static void withdraw() {// 取款
		if (sa == null) {
			System.out.println("请先开通存储卡账户");
			return;
		}
		System.out.println("请输入取款金额：");
		double money = scan.nextDouble();
		if (money > sa.getBalance()) {
			System.out.println("余额不足，最大取款金额：" + sa.getBalance());
		} else {
			System.out.println("余额足够取款成功！");
			sa.setBalance(sa.getBalance() - money);
			System.out.println("取款后余额为：" + sa.getBalance());
		}
	}

	public static void comsume() {// 消费
		if (ca == null) {
			System.out.println("请先开通信用卡账户");
			return;
		}
		System.out.println("您的信用卡的额度为:");
		quota = scan.nextDouble();
		ca.setBalance(quota);
		System.out.println("请输入消费刷卡金额：");
		double money = scan.nextDouble();
		ca.setBalance(ca.getBalance() - money);
		System.out.println("消费成功！");
	}

	public static void repay() {// 还款
		if (ca == null) {
			System.out.println("请先开通信用卡账户");
			return;
		}
		System.out.println("您需要还款的金额为：" + (quota - ca.getBalance()));
		System.out.println("请输入本次还款的金额：");
		double money = scan.nextDouble();
		if(money>(quota - ca.getBalance())) {
			System.out.println("还款金额超出，请重新输入还款金额：");
			money = scan.nextDouble();
		}
		ca.setBalance(ca.getBalance() + money);
		System.out.println("剩余的还款金额为：" + (quota - ca.getBalance()));
		System.out.println("还款成功！");
	}

	public static void settle() {// 结算
		if (ca == null) {
			System.out.println("暂无信用卡，无法结算服务费：");
		} else {
			System.out.println("信用卡服务费结算成功！");
			System.out.println("服务费为："+ca.getServiceFee());
			ca.assessServiceCharge();
		}
		if (sa == null) {
			System.out.println("暂无存储卡，无法结算利率：");
		} else {
			System.out.println("存储卡利率结算成功！");
			System.out.println("利息为："+(sa.getBalance()*sa.getInterestRate()));
			sa.payInterest();
		}

	}

	public static void balance() {// 查询余额
		if (ca == null) {
			System.out.println("暂无信用卡，无法查询信用卡余额");
		} else {
			System.out.println("信用卡余额：" + ca.getBalance());
		}
		if (sa == null) {
			System.out.println("暂无存储卡，无法查询存储卡余额");
		} else {
			System.out.println("存储卡余额：" + sa.getBalance());
		}

	}
}
