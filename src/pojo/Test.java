package pojo;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Test {
	
public static void main(String[] args) {
	
	try {  
		   
        File file = new File("configure.xml");  
        JAXBContext jaxbContext = JAXBContext.newInstance(Wizard.class);  
  
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
        Wizard wiz= (Wizard) jaxbUnmarshaller.unmarshal(file);  
         
        System.out.println(wiz);
     } catch (JAXBException e) {  
       e.printStackTrace();  
     }  
}

}
