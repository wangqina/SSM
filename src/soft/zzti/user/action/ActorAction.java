package soft.zzti.user.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import soft.zzti.edu.po.Actor;
import soft.zzti.user.mapper.ActorMapper;

import com.opensymphony.xwork2.ModelDriven;

public class ActorAction  implements  ModelDriven<Actor>{
	private Actor actor;
	/*
	 * 验证用户的信息，如果用户信息错误，返回error。
	 *  
	 * */
	//将actormapper注入到进来
	@Autowired
	private ActorMapper  actorMapper;
	public String getActor(){
		//在用户登陆之前，输入使用切面的方式输出谁登陆系统
		actor= actorMapper.getActor(actor);	
		if(actor!=null){
			return "success";
		}else{
			//在返回之前，在这个地方进行织入
			return "error";
		}
		
	}

	
	

	public void setActor(Actor actor) {
		this.actor = actor;
	}


	public ActorMapper getActorMapper() {
		return actorMapper;
	}
	public void setActorMapper(ActorMapper actorMapper) {
		this.actorMapper = actorMapper;
	}




	@Override
	public Actor getModel() {
		// TODO Auto-generated method stub
		return actor;
	}
	
	

}
