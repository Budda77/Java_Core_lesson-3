package ua.lviv.lgs;

public class Rectangle {
	private double length;
	private double width;
	
	Rectangle(){
		this.length = 12;
		this.width = 15;
	}
	Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	public double square(double length, double width) {
		this.length = length;
		this.width = width;
		return length * width;
	}
	public double square() {
		return this.length * this.width;
	}
	
	public double perimeter(double length, double width) {
		return (length + width) *2;
	}
	public double perimeter() {
		return (this.length + this.width) *2;
	}
		
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	

}
