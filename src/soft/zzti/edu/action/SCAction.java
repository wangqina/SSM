package soft.zzti.edu.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import soft.zzti.edu.mapper.SCMapper;
import soft.zzti.edu.po.SC;

import com.opensymphony.xwork2.ModelDriven;

public class SCAction  implements ModelDriven<SC>{

	private SC sc=new SC();
	@Autowired
	private SCMapper scmapper;
	private List<SC> listSc=new ArrayList<SC>();
	public String  selectSc(){
		listSc=scmapper.selectBysno("2013");
		System.out.println("student---"+listSc.get(0).getCno());
		return "success";
	}
	
	public String selectcourse(){
		listSc=listSc=scmapper.selectcourse();
		return "success";
	}
	public SC getSc() {
		return sc;
	}

	public void setSc(SC sc) {
		this.sc = sc;
	}

	public SCMapper getScmapper() {
		return scmapper;
	}

	public void setScmapper(SCMapper scmapper) {
		this.scmapper = scmapper;
	}

	public List<SC> getListSc() {
		return listSc;
	}

	public void setListSc(List<SC> listSc) {
		this.listSc = listSc;
	}

	@Override
	public SC getModel() {
		// TODO Auto-generated method stub
		return sc;
	}
	
	

}
