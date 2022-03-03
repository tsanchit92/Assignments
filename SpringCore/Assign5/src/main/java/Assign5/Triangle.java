package Assign5;

import java.beans.JavaBean;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Qualifier;

import org.springframework.beans.factory.annotation.Required;


public class Triangle implements Shape
{
	@Inject
	@Named("point0")
	private Point pointA;
	@Inject
	@Named("point1")
	private Point pointB;
	@Inject
	@Named("point2")
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}
	
	@Required
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	
	public Point getPointB() {
		return pointB;
	}

	@Required
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	public Point getPointC() {
		return pointC;
	}

	@Required
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	@Override
	public void draw() {
		System.out.println("Point A=("+ getPointA().getX() +" , "+getPointA().getY()+")"+"Point B=("+getPointB().getX() +" , "+getPointB().getY()+")"+"Point C=("+getPointC().getX() +" , "+getPointC().getY()+")");
		
	}

}
