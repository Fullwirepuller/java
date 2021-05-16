package Express;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class express {
	public static void main(String[] args) {
		String express = "add(sub(2,1),max(1,add(1,1)))";
		String regex = "((add)|(sub)|(min)|(max)|(doubleMe))\\(\\d{1,}(,\\d{1,})?\\)";
		String info =express;
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(express);
		while(m.find()){
			String baseExpress = m.group();
			String r = result(baseExpress);
			System.out.println("表达式为："+info);
			System.out.println(baseExpress+"="+r);
			baseExpress = baseExpress.replaceAll("\\(", "\\\\(");
			baseExpress = baseExpress.replaceAll("\\)", "\\\\)");
			info = info.replaceAll(baseExpress, r);
			System.out.println("替换后："+info);
			System.out.println();
			m = p.matcher(info); 
		}
		System.out.println(express+"="+info);
	
	}
	
	public static String result(String express){
		String iresult = "";
		int result = 0;
		String code = express.substring(0, express.indexOf("("));
		if(code.equals("doubleMe")){
			String number = express.substring(express.indexOf("(")+1,express.indexOf(")"));
			result = Integer.parseInt(number) * 2;
		}else{
			String sFirst = express.substring(express.indexOf("(")+1,express.indexOf(","));
			int firstN = Integer.parseInt(sFirst);
			
			String sSecond = express.substring(express.indexOf(",")+1,express.indexOf(")"));
			int secondN = Integer.parseInt(sSecond);
			
			switch(code){
			case "add": result = firstN + secondN;break;
			case "sub": result = firstN - secondN;break;
			case "min": result = firstN<secondN? firstN:secondN;break;
			case "max": result = firstN>secondN? firstN:secondN;break;
			}
		}
		iresult +=result;
		return iresult;
	}
	
	
}
