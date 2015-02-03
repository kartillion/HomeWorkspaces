package org.imran.kartillion;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;

public class Triangle implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean, Shape{
	
	/*private String type;
	private int height;
	
	public Triangle (String type){
		this.type = type;
	}
	
	public Triangle (int height){
		this.height = height;
	}
	
	public Triangle (String type, int height){
		this.type = type;
		this.height = height;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}*/
	
	/*private Point pointA;
	private Point pointB;
	private Point pointC;*/
	
	private ApplicationContext context = null;
	private String beanName = "";
	private BeanFactory beanFactory = null;
	
	@Autowired
	private MessageSource messageSource = null;
	
	
	
	/*public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}*/
	
	private List<Point> points; 

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw(){
		
		System.out.println("Drawing Triangle");
		for(Point point: points){
			System.out.println(messageSource.getMessage("drawing.point", new Object[] {point.getX(), point.getY()}, "Default Drawing Message", null));
			System.out.println(messageSource.getMessage("greeting2", null, "Default Greeting2", null));
		}
		
		/*System.out.println("Getting points of object pointA: x = "+pointA.getX());
		System.out.println("Getting points of object pointA: y = "+pointA.getY());
		
		System.out.println("Getting points of object pointB: x = "+pointB.getX());
		System.out.println("Getting points of object pointB: y = "+pointB.getY());
		
		System.out.println("Getting points of object pointC: x = "+pointC.getX());
		System.out.println("Getting points of object pointC: y = "+pointC.getY());*/
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
		//System.out.println(context.getMessage("greeting", null, "Default Greeting2", null));
	}
	
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
		
	}

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
		//System.out.println("Bean name = " + this.beanName);
		
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		//System.out.println("Spring Init Method");
		
	}

	@Override
	public void destroy() throws Exception {
		//System.out.println("Spring Destroy Method");
		
	}
	
	public void InitMethod(){
		//System.out.println("My Own Init Method");
	}
	
	public void DestroyMethod(){
		//System.out.println("My Own Destroy Method");
	}	
}
