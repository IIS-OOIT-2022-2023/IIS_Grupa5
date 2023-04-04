package geometry;

import java.awt.Graphics;

public class Donut extends Circle{

	private int innerRadius; 
	
	public Donut() {
		
	}
	public Donut(Point center, int radius, int innerRadius) {
		super(center, radius);
		this.innerRadius = innerRadius;
	}
	public Donut(Point center, int radius, int innerRadius, boolean selected) {
		super(center, radius, selected);
		this.innerRadius = innerRadius;
	}
	@Override
	public double area() {
		
		return super.area() - innerRadius*innerRadius*Math.PI;
	}
	@Override
	public double circumference() {
		
		return super.circumference() + 2*innerRadius*Math.PI;
	}
	public int getInnerRadius() {
		return innerRadius;
	}
	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}
	@Override
	public String toString() {
		// Center: (x,y), radius = 55, innerRadius = 44
		return super.toString() + ", innerRadius = " + innerRadius;
	}
	@Override
	public boolean equals(Object obj) {
	
		if(obj instanceof Donut) {
			Donut pomocna = (Donut)obj;
			if(getCenter().equals(pomocna.getCenter()) 
					&& getRadius() == pomocna.getRadius()
					&& innerRadius == pomocna.innerRadius)
				return true;
			else 
				return false;
		} else 
			return false;
	}
	@Override
	public boolean contains(int x, int y) {

		return super.contains(x, y) && getCenter().distance(x,y) >= innerRadius;
	}
	@Override
	public boolean contains(Point p) {
		// TODO Auto-generated method stub
		return super.contains(p) && getCenter().distance(p.getX(), p.getY()) >= innerRadius;
	}
	@Override
	public void draw(Graphics g) {
		super.draw(g);  //nacrta spoljasnji krug
		g.drawOval(getCenter().getX() - innerRadius, getCenter().getY() - innerRadius,
				2*innerRadius, 2*innerRadius); //nacrta unutrasnji krug
	}
}
