package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import Tools.DBConnection;
import Vo.Student;

public class StudentDao {
	//���ؼ��ֽ��в�ѯ�����ز�ѯ�����Ӧ�Ķ���
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
		
	//��ָ���ֶν��в�ѯ��������ѯ�������ڼ�����
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
	
	//��������ѧ����Ϣ
	public ArrayList<Student> readStudentFromKeyBoard(){
		ArrayList<Student> listStu = new ArrayList<Student>();
		Scanner scan = new Scanner(System.in);
		System.out.println("������ѧ����Ϣ����end����");
		String data="";
		
		while(!(data = scan.nextLine()).equals("end")){
			String array[] = data.split(",|��");
			String sno = array[0];
			if(get(sno) == null){
				float score = Float.parseFloat(array[4]);
				Student student = new Student(array[0],array[1],array[2],array[3],score);
				listStu.add(student);
			}else{
				System.out.println("ѧ��" + sno + "�Ѵ��ڣ����������룡");
			}
			
		}
		return listStu;
		
	}
	
	//��ѧ�����ϲ��뵽���ݿ⣬���سɹ����������������1��ʾ����ɹ���
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
	
	//ɾ��ָ���ؼ��ֵļ�¼�����سɹ�ɾ��������������1��ʾɾ���ɣ�
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
