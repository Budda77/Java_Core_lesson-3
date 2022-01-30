package ua.lviv.lgs;

public class Circle {
	public double radius;
	public double diameter;
	final double Pi = 3.14;
	
	Circle(){
		this.radius = 1;
		this.diameter = this.radius *2; 
	}
	
	Circle(double radius){
		this.radius = radius;
		this.diameter = this.radius *2; 
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		//this.diameter = this.radius*2;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
		//this.radius = this.diameter/2;
	}
		
	
	public double circleLength() {
		return 2*Pi*radius;
	}
	public double circleLength(double radius) {
		this.radius = radius;
		return 2*Pi*this.radius;
	}
	
	public double circleSquare() {
		
		return (Pi*Math.pow(this.diameter, 2))/4;
	}
	
	public double circleSquare(double diameter) {
		this.diameter = diameter;
		return (Pi*Math.pow(this.diameter, 2))/4;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", diameter=" + diameter + "]";
	}

	

}
