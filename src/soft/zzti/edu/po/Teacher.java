package soft.zzti.edu.po;

import java.util.List;

public class Teacher {
	
	private String tno;
	private String tname;
	private String tdept;
	private String tcourse;
	
	private List<Student>  students;
	private Clazz clazz;
	
	
	
	public Clazz getClazz() {
		return clazz;
	}
	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public String getTno() {
		return tno;
	}
	public void setTno(String tno) {
		this.tno = tno;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTdept() {
		return tdept;
	}
	public void setTdept(String tdept) {
		this.tdept = tdept;
	}
	public String getTcourse() {
		return tcourse;
	}
	public void setTcourse(String tcourse) {
		this.tcourse = tcourse;
	}
	
	
	

}
