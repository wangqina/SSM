package soft.zzti.edu.log;
import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
@Aspect
@Component
public class UserLogimp implements UserLog {
	@Before("execution(public * soft.zzti.user.mapper.ActorMapper.getActor(*))")
	public void beforLog(JoinPoint joinPoint){		
		System.out.println("��½ǰ----------");
		
	}
	public void afterLog(){
		System.out.println("��½��");
	}
	public void success(){
		System.out.println("��½�ɹ�");
	}
	public void loginError(String name){
		System.out.println(name+"��½ʧ��");
		
	}
	
	

}
