package soft.zzti.edu.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;

import soft.zzti.edu.mapper.TeacherMapper;
import soft.zzti.edu.po.Teacher;
@Controller
public class TeacherAction  implements  ModelDriven<Teacher> {
	private Teacher teacher=new Teacher();
	@Autowired
	private TeacherMapper teacherMapper;
	private List<Teacher> teacherList= new ArrayList<Teacher>();
	
	public String getTeacherOfStudents(){
		//获取当前老师教的所有的学生的信息
		teacher=teacherMapper.getTeacherOfStudents(teacher.getTno());
		System.out.println("teacherList----"+teacher.getStudents().size());
		return "success";
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public TeacherMapper getTeacherMapper() {
		return teacherMapper;
	}

	public void setTeacherMapper(TeacherMapper teacherMapper) {
		this.teacherMapper = teacherMapper;
	}

	public List<Teacher> getTeacherList() {
		return teacherList;
	}

	public void setTeacherList(List<Teacher> teacherList) {
		this.teacherList = teacherList;
	}

	@Override
	public Teacher getModel() {
		// TODO Auto-generated method stub
		return teacher;
	}
	
	
	

}
