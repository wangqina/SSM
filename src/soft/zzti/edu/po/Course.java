package soft.zzti.edu.po;

import org.springframework.stereotype.Component;

@Component
public class Course {
private String cno;
private   String course;
public String getCno() {
	return cno;
}
public void setCno(String cno) {
	this.cno = cno;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}



}
