package pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class Option {
	
	 @XmlElement(name="type")
	 public String type;
	 @XmlElement(name="workaround")
	 public String workaround;
	 

		public String getType() {
			return type;
		}
		
		public void setType(String type) {
			this.type = type;
		}

		public String getWorkaround() {
			return workaround;
		}
		
		public void setWorkaround(String workaround) {
			this.workaround = workaround;
		}

}
