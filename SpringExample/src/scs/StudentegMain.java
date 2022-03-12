package scs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class StudentegMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Studenteg s=(Studenteg)factory.getBean("stu");
		s.setRn(103);
		s.setName("anil");
		System.out.println(s.getRn()+" "+s.getName());
	}

}
