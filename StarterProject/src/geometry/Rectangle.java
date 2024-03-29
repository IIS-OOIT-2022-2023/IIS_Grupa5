package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape{
	
	private Point upperLeftPoint;
	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(Point upperLeftPoint, int width, int height) {
		this.upperLeftPoint = upperLeftPoint;
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(Point upperLeftPoint, int width, int height, boolean selected) {
		this.upperLeftPoint = upperLeftPoint;
		this.width = width;
		this.height = height;
		this.selected = selected;
	}
	
	public String toString()  {
		return "Upper left point: " + upperLeftPoint 
				+ ", width = " + width +  " , height = " + height;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle pomocna = (Rectangle)obj;
			if(this.upperLeftPoint.equals(pomocna.upperLeftPoint) 
					&& width == pomocna.width
				&& height == pomocna.height)
				return true;
			else 
				return false;
		} else
			return false;
	}
	
	public boolean contains(int x, int y) {
		return (x >= upperLeftPoint.getX()
				&& x <= upperLeftPoint.getX() + width
				&& y >= upperLeftPoint.getY()
				&& y <= upperLeftPoint.getY() + height);
				
	}

	// Povrsina pravougaonika P=w*h
	public int area() {
		return width * height;
	}
	
	// Obim pravougaonika O=2*(w+h)
	public int circumference() {
		return 2* (width + height);
	}
	
	// Metode pristupa
	public Point getUpperLeftPoint() {
		return upperLeftPoint;
	}
	public void setUpperLeftPoint(Point upperLeftPoint) {
		this.upperLeftPoint = upperLeftPoint;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawRect(upperLeftPoint.getX(), upperLeftPoint.getY(), 
				width, height);
		if(selected) {
			g.setColor(Color.BLUE);
			g.drawRect(upperLeftPoint.getX()-2, upperLeftPoint.getY()-2,4,4); //gore levo
			g.drawRect(upperLeftPoint.getX()+width-2, upperLeftPoint.getY()-2,4,4); //gore desno
			g.drawRect(upperLeftPoint.getX()-2, upperLeftPoint.getY()+height-2,4,4); //dole levo
			g.drawRect(upperLeftPoint.getX()+width-2, upperLeftPoint.getY()+height-2,4,4); //dole desno
		}
		
	}

	@Override
	public void moveTo(int x, int y) {
		upperLeftPoint.moveTo(x, y);		
	}

	@Override
	public void moveBy(int byX, int byY) {
		upperLeftPoint.moveBy(byX, byY);	
	}
	
	@Override
	public int compareTo(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle shapeToCompare = (Rectangle)obj;
			return this.area() - shapeToCompare.area();
		}
		return 0;
	}
}
