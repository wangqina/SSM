package soft.zzti.edu.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import soft.zzti.edu.mapper.CourseMapper;
import soft.zzti.edu.po.Course;
@Controller
public class CourseAction   implements  ModelDriven<Course>{
	
	private Course course=new Course();
	private String method;	
	List list =new ArrayList<Course>();
	@Autowired
	private CourseMapper courseMapper;
	private String cno;
	 
	public String selectList(){
		
		list=courseMapper.selectList();
		
		return "success";
	}
	//现在也是通过这样的方式进行获取这个属性，
	public String findByCno(){
		
		course=courseMapper.findByCno(course.getCno());
		
		return "success";
		
	}
	/**
	 * 插入数据
	 * @return
	 */
  
public String insertCourse(){	
	courseMapper.insertCourse(course);
	return "success";
}

public String delectCource(){
	
	courseMapper.delectCource(course.getCno());	
	return "success";
}

public String editCourse(){
	courseMapper.editCourse(course);
	return "success";
}

 



public String getCno() {
	return cno;
}

public void setCno(String cno) {
	this.cno = cno;
}

public String getMethod() {
	return method;
}

public void setMethod(String method) {
	this.method = method;
}

@Override
public Course getModel() {	
	return course;
}
public List getList() {
	return list;
}
public void setList(List list) {
	this.list = list;
}
public Course getCourse() {
	return course;
}
public void setCourse(Course course) {
	this.course = course;
}
public CourseMapper getCourseMapper() {
	return courseMapper;
}
public void setCourseMapper(CourseMapper courseMapper) {
	this.courseMapper = courseMapper;
}



}
