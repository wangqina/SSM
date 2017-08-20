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
		System.out.println("µÇÂ½Ç°----------");
		
	}
	public void afterLog(){
		System.out.println("µÇÂ½ºó");
	}
	public void success(){
		System.out.println("µÇÂ½³É¹¦");
	}
	public void loginError(String name){
		System.out.println(name+"µÇÂ½Ê§°Ü");
		
	}
	
	

}
