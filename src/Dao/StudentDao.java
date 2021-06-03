package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import Tools.DBConnection;
import Vo.Student;

public class StudentDao {
	//按关键字进行查询，返回查询结果对应的对象
	public static Student get(String sno){
		Student stu = new Student();
		DBConnection db = new DBConnection();
		Connection con = db.getCon();
		String sql = "select * from t_student where sno=?";
		try{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, sno);
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				stu = new Student(rs.getString("sno"),
				rs.getString("name"),
				rs.getString("gender"),
				rs.getString("birth"),
				rs.getFloat("score"));
			}	
		}catch (Exception e) {
			e.printStackTrace();
		}
		return stu;
	}
		
	//按指定字段进行查询，发布查询结果存放在集合中
	public ArrayList<Student> query(String fileName,String value, String flux){
		ArrayList<Student> listStu = new ArrayList<Student>();
		DBConnection db = new DBConnection();
		Connection con = db.getCon();
		String sql = "";
		String condition = "";
		if(flux.equals("y")){
			sql = "select * from t_student where" + fileName + "like ?";
			condition = "%"+value+"%";
		}else{
			sql = "select * from t_student where" + fileName +"=?";
			condition = value;
		}
		
		try{
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, condition);
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				
			}
		}catch (Exception e) {
			
		}
		return listStu;
	}
	
	//键盘输入学生信息
	public ArrayList<Student> readStudentFromKeyBoard(){
		ArrayList<Student> listStu = new ArrayList<Student>();
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生信息，以end结束");
		String data="";
		
		while(!(data = scan.nextLine()).equals("end")){
			String array[] = data.split(",|，");
			String sno = array[0];
			if(get(sno) == null){
				float score = Float.parseFloat(array[4]);
				Student student = new Student(array[0],array[1],array[2],array[3],score);
				listStu.add(student);
			}else{
				System.out.println("学号" + sno + "已存在，请重新输入！");
			}
			
		}
		return listStu;
		
	}
	
	//将学生集合插入到数据库，返回成功插入的条数（大于1表示插入成功）
	public int insert(ArrayList<Student> listStu){
		int iRet = 0;
		
		DBConnection db = new DBConnection();
		Connection con = db.getCon();
		try{
			for(Student student : listStu){
				String sql = "insert into t_student values(?,?,?,?,?)";
				
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, student.getSno());
				pst.setString(2, student.getName());
				pst.setString(3, student.getGender());
				pst.setString(4, student.getBirth());
				pst.setFloat(5, student.getScore());
				int count = pst.executeUpdate();
				iRet +=count;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return iRet;
	}
	
	//删除指定关键字的记录，返回成功删除的条数（大于1表示删除成）
	public int delete(String sno){
		int iRet = 0;
		DBConnection db = new DBConnection();
		Connection con = db.getCon();
		String sql = "detele * from student where sno = ?";
		try{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, sno);
			int count = pst.executeUpdate();
			iRet += count;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return iRet;
	}
	
	
	
}
