package com.javapoint;  
  
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

  
public class Test {  
public static void main(String[] args) {  
    Resource resource=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(resource); 
          
    Student student=(Student)factory.getBean("studentbean");  
    student.displayInfo();
    
    /*Below is one another way of doing Setter Injection*/
    
	BeanFactory beanfactory = new ClassPathXmlApplicationContext("applicationContext.xml");
    Student bean = (Student) beanfactory.getBean("studentbean");
    String msg = bean.getName();
    System.out.println("Another way...");
    System.out.println(msg);
    
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
    Student objA = (Student) context.getBean("studentbean");  
    objA.setName("I'm object A");
    System.out.println("Printing Object A...");
    objA.displayInfo();
    
    Student objB = (Student) context.getBean("studentbean");
    System.out.println("Printing Object B...");
    objB.displayInfo();
    
    AbstractApplicationContext abstractContext = new ClassPathXmlApplicationContext("applicationContext.xml");  
    Student objC = (Student) abstractContext.getBean("studentbean");  
    objC.setName("I'm object C");
    objC.displayInfo();
    abstractContext.registerShutdownHook();
}  
}  