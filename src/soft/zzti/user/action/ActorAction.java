package soft.zzti.user.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import soft.zzti.edu.po.Actor;
import soft.zzti.user.mapper.ActorMapper;

import com.opensymphony.xwork2.ModelDriven;

public class ActorAction  implements  ModelDriven<Actor>{
	private Actor actor;
	/*
	 * ��֤�û�����Ϣ������û���Ϣ���󣬷���error��
	 *  
	 * */
	//��actormapperע�뵽����
	@Autowired
	private ActorMapper  actorMapper;
	public String getActor(){
		//���û���½֮ǰ������ʹ������ķ�ʽ���˭��½ϵͳ
		actor= actorMapper.getActor(actor);	
		if(actor!=null){
			return "success";
		}else{
			//�ڷ���֮ǰ��������ط�����֯��
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
