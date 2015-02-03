package org.imran.kartillion;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		//Triangle triangle = new Triangle();  here we are not using Spring framework
		
		//below we are using beanfactory for reading the xml configuration file using filesystemresource
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Triangle triangle = (Triangle) factory.getBean("triangle");
		
		//below we are using applicationscontext for reading the xml configuration file using classpath
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		/*Triangle triangle = (Triangle) context.getBean("triangle2");
		triangle.draw();*/
		/*Circle circle = (Circle) context.getBean("circle");
		circle.draw();*/
		/*Shape shape = (Shape) context.getBean("triangle2");
		shape.draw();*/
		Shape shape2 = (Shape) context.getBean("circle");
		shape2.draw();
		//System.out.println(context.getMessage("greeting", null, "Default Greeting", null));
				
	}

}
