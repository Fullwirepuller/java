package Express;

public class Validate {
	public static void username(String p) {
		String regex = "[A-Za-z0-9_\\-\\u4e00-\\u9fa5]+";
		System.out.println(p.matches(regex));
	}
	
	public static void QQ(String p) {
		String regex = "[1-9]([0-9]{5,11})";
		System.out.println(p.matches(regex));
	}
	
	public static void Password(String p) {
		String regex = "[A-Za-z0-9_\\-\\u4e00-\\u9fa5]+";
		System.out.println(p.matches(regex));
	}
	
	public static void Email(String p) {
		String regex = "(\"\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*\")";
		System.out.println(p.matches(regex));
	}
	
	public static void ID(String p) {
		String regex = "\\d{17}[\\d|x]|\\d{15}";
		System.out.println(p.matches(regex));
	}
	
	public static void tel(String p) {
		String regex = "[0-9-()()]{7,18}";
		System.out.println(p.matches(regex));
	}
	
	public static void phoneNumber(String p) {
		String regex = "0?(13|14|15|17|18)[0-9]{9}";
		System.out.println(p.matches(regex));
	}
	
	public static void website(String p) {
		String regex = "^((https|http|ftp|rtsp|mms)?:\\/\\/)[^\\s]+";
		System.out.println(p.matches(regex));
	}
	
	public static void postalCode(String p) {
		String regex = "^\\d{6}";
		System.out.println(p.matches(regex));
	}
	
	public static void Chinese(String p) {
		String regex = "[\\u4e00-\\u9fa5]";
		System.out.println(p.matches(regex));
	}
	
	public static void birthday(String p) {
		String regex = "^\\d{4}-\\d{2}-\\d{2}$";
		System.out.println(p.matches(regex));
	}
}
