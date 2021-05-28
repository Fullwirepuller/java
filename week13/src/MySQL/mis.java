package MySQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class mis {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try{
		//1.加载驱动
		String driverName = "com.mysql.jdbc.Driver";
		Class.forName(driverName);
		
		//2.建立与数据库的链接
		String url = "jdbc:mysql://localhost:3306/mis?useUnicode=true&characterEncoding=utf-8";
		String username = "root";
		String password = "123456";
		Connection con = DriverManager.getConnection(url,username,password);
		
		//3.创建语句
		String sql = "insert into tstudent(sno,name,gender,birth,score) values(?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		
		System.out.println("请输入学生信息(end结束)：");
		String data = " ";
		while (!(data = scan.nextLine()).equals("end")) {
			System.out.println("学生学号：");
			String sno = scan.nextLine();
			pst.setString(1,sno);
			System.out.println("学生姓名：");
			String name = scan.nextLine();
			pst.setString(2,name);
			System.out.println("学生性别：");
			String gender = scan.nextLine();
			pst.setString(3,gender);
			System.out.println("学生出生日期：");
			String birth = scan.nextLine();
			pst.setString(4,birth);
			System.out.println("学生成绩：");
			float score = scan.nextFloat();
			pst.setFloat(5,score);
		}
		
		String SQL = "select * from tstudent where sno='1001'";
		PreparedStatement ps = con.prepareStatement(SQL);
		
		//4.执行语句
		ResultSet rs = ps.executeQuery();
		
		//5.返回结果处理
		while(rs.next()){
			String sno = rs.getString("sno");
			String name = rs.getString("name");
			String birth = rs.getString("birth");
			String gender = rs.getString("gender");
			float score = rs.getFloat("score");
			System.out.println(sno+"\t"+name+"\t"+birth+"\t"+gender+"\t"+score);
		}
		
		//6.释放资源
		rs.close();
		pst.close();
		con.close();
		
		}catch (Exception e) {
		    e.printStackTrace();
		}
	}
}
