package pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="wizard")
@XmlAccessorType(XmlAccessType.FIELD)
public class Wizard {
	
	@XmlElement(name="component")
	public List<Component> component;
	

	public Wizard() {
		super();
	}
	

	public Wizard(List<Component> component) {
		super();
		this.component = component;
	}

	public List<Component> getComponent() {
		return component;
	}
	
	public void setComponent(List<Component> component) {
		this.component = component;
	}
}
