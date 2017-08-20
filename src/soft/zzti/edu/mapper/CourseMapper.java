package soft.zzti.edu.mapper;
import java.util.List;
import soft.zzti.edu.po.Course;

public interface CourseMapper {
	
	/**
	 * 查询出所有的课程的信息
	 */
	public List<Course> selectList();
	public void insertCourse(Course  course);
	public void delectCource(String cno);
	public void editCourse(Course couse);
	public Course findByCno(String cno);
	
	
	 

}
