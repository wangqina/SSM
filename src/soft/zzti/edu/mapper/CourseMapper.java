package soft.zzti.edu.mapper;
import java.util.List;
import soft.zzti.edu.po.Course;

public interface CourseMapper {
	
	/**
	 * ��ѯ�����еĿγ̵���Ϣ
	 */
	public List<Course> selectList();
	public void insertCourse(Course  course);
	public void delectCource(String cno);
	public void editCourse(Course couse);
	public Course findByCno(String cno);
	
	
	 

}
