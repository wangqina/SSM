package soft.zzti.edu.test;


import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import soft.zzti.edu.mapper.CourseMapper;
import soft.zzti.edu.po.Course;

public class CourseUtil {
	 
	public static void main(String[] args) {
		 String resource = "config//mybatis//SqlMapConfig.xml";  
	        // �õ������ļ���  
	        InputStream inputStream=null;
			try {
				inputStream = Resources.getResourceAsStream(resource);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
	  
	        // �����Ự����,��build�д��������ļ���Ϣ  
	        SqlSessionFactory  sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);  
	        SqlSession sqlSession = sqlSessionFactory.openSession(); 
	        CourseMapper mapper=sqlSession.getMapper(CourseMapper.class);
	        Course course=new Course();
	        course.setCno("12");
	        course.setCourse("rr");
	        System.out.print(mapper.selectList().size());
	       //mapper.insertCourse(course);
	}

	private SqlSessionFactory sqlSessionFactory;
	  
	  
	    public void setUp() throws Exception {  
	        // MyBatis�����ļ�  
	    	String resource = "config//mybatis//SqlMapConfig.xml"; 
	        // �õ������ļ���  
	        InputStream inputStream = Resources.getResourceAsStream(resource);  
	  
	        // �����Ự����,��build�д��������ļ���Ϣ  
	        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);  
	  
	    }  
	  
	   
	    public void testFindUserById() throws Exception {  
	        SqlSession sqlSession = sqlSessionFactory.openSession(); 
	        CourseMapper mapper=sqlSession.getMapper(CourseMapper.class);
	        Course course=new Course();
	        course.setCno("2");
	        course.setCourse("��ѧ");
	        mapper.insertCourse(course);
	        sqlSession.close();  
	        //System.out.println(user);  
	    }  
	  
	   
	  

}
