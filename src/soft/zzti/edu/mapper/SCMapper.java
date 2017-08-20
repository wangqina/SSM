package soft.zzti.edu.mapper;
import java.util.List;
import soft.zzti.edu.po.SC;
public interface SCMapper {
	public List<SC> selectBysno(String sno);
	
	public List<SC>  selectcourse();
	 

}
