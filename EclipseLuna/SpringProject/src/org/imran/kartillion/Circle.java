package org.imran.kartillion;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component
//@Service
//@Repository
//@Controller
public class Circle implements Shape, ApplicationEventPublisherAware{
	
	private Point center;
	private ApplicationEventPublisher publisher;

	public Point getCenter() {
		return center;
	}

	/*@Required
	public void setCenter(Point center) {
		this.center = center;
	}*/
	
	@Autowired	
	@Qualifier("circleRelated")
	//@Resource(name="pointB")	
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override	
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle Points are (" + center.getX() + "," + center.getY() + ")");
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
	}
	
	@PostConstruct
	public void initializeCircle(){
		System.out.println("Initializing Circle");
	}
	
	@PreDestroy
	public void destroyingCircle(){
		System.out.println("Destroying Circle");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
		
	}
}
