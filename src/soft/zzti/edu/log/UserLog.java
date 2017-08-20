package soft.zzti.edu.log;

import org.aspectj.lang.JoinPoint;


public interface UserLog {
	/* 用户登陆日志*/
  public void beforLog(JoinPoint joinPoint);
  public void afterLog();
  public void success();
  public void loginError(String name);
}
