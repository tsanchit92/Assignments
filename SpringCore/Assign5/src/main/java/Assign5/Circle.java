package Assign5;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;


public class Circle implements Shape
{
	
	private Point center;
	public Point getCenter() {
		return center;
	}
	
	@Resource(name= "point0")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Circle center is:("+getCenter().getX()+","+getCenter().getY()+")");
		
	}

	
	

}
