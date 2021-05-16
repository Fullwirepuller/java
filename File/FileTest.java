package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileTest {

	public static void main(String[] args) {
		try{
			File myFile = new File("E:/question.txt");
			FileReader fr = new FileReader(myFile);
			BufferedReader bf = new BufferedReader(fr);
			
			File oFl = new File("E:/question.txt");
			FileWriter fwt = new FileWriter(oFl);
			PrintWriter pwt = new PrintWriter(fwt);
			
			String Line = "";
			while((Line = bf.readLine())!=null){
				String regex = "((add)|(sub)|(min)|(max)|(doubleMe))\\(\\d{1,}(,\\d{1,})?\\)";
				String info =Line;
				Pattern p = Pattern.compile(regex);
				Matcher m = p.matcher(Line);
				
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
				pwt.println(info);
			}
			fr.close();
			bf.close();
			fwt.close();
			pwt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
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
			case "muti": result = firstN * secondN;break;
			case "dvi": result =firstN / secondN;break;
			}
		}
		iresult +=result;
		return iresult;
	}

}
