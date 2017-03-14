package com.yang.rest.bean;
import javax.xml.bind.annotation.XmlRootElement;  

@XmlRootElement  
public class Lun {
	private String lunId;
	
	private String lunName;
	private String lunSize;
	private String initialGroup;
	private String targetGroup;
	
	public Lun(){}
	public Lun(String id,String name,String size,String initiarGroup,String targetGroup)
	{
		this.lunId=id;
		this.lunName=name;
		this.lunSize=size;
		this.initialGroup=initiarGroup;
		this.targetGroup=targetGroup;
	}

	public String getLunId() {
		return lunId;
	}
	public void setLunId(String lunId) {
		this.lunId = lunId;
	}
	public String getLunName() {
		return lunName;
	}
	public void setLunName(String lunName) {
		this.lunName = lunName;
	}
	public String getLunSize() {
		return lunSize;
	}
	public void setLunSize(String lunSize) {
		this.lunSize = lunSize;
	}
	public String getInitialGroup() {
		return initialGroup;
	}
	public void setInitialGroup(String initialGroup) {
		this.initialGroup = initialGroup;
	}
	public String getTargetGroup() {
		return targetGroup;
	}
	public void setTargetGroup(String targetGroup) {
		this.targetGroup = targetGroup;
	}
	

}
