package soft.zzti.edu.log;

import org.aspectj.lang.JoinPoint;


public interface UserLog {
	/* �û���½��־*/
  public void beforLog(JoinPoint joinPoint);
  public void afterLog();
  public void success();
  public void loginError(String name);
}
