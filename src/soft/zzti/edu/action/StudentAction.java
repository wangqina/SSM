package soft.zzti.edu.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import soft.zzti.edu.mapper.SCMapper;
import soft.zzti.edu.mapper.StudentMapper;
import soft.zzti.edu.po.SC;
import soft.zzti.edu.po.Student;

import com.opensymphony.xwork2.ModelDriven;
@Controller
public class StudentAction implements  ModelDriven<Student>{
	
	private Student student=new Student();
	@Autowired
	private StudentMapper studentMapper;
	@Autowired
	private SCMapper scmapper;
	private String sno;
	private List<SC> listSc=new ArrayList<SC>();
	
	public String  selectByid(){
		student=studentMapper.selectById(student.getSno());		
		
		if(student==null){
			//将日志进行输出
			//student.setSname("error");
			return "error";
		}else{
			listSc=scmapper.selectBysno(student.getSno());
			System.out.println("size-----"+listSc.size());
			return "success"; 
		}
		
	}
	

	@Override
	public Student getModel() {
		// TODO Auto-generated method stub
		return student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public StudentMapper getStudentMapper() {
		return studentMapper;
	}

	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}


	public String getSno() {
		return sno;
	}


	public void setSno(String sno) {
		this.sno = sno;
	}


	public SCMapper getScmapper() {
		return scmapper;
	}


	public void setScmapper(SCMapper scmapper) {
		this.scmapper = scmapper;
	}


	public List getListSc() {
		return listSc;
	}


	public void setListSc(List listSc) {
		this.listSc = listSc;
	}
	
	

}
