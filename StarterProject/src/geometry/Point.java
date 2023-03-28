package geometry;

public class Point {

	private int x;
	private int y;
	private boolean selected;
	
	public Point()  {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int x, int y, boolean selected) {
		this(x,y);
		this.selected = selected;
	}
	
	public String toString()  {
		return "(" + x + "," + y + ")";   // (x,y)
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point pomocna = (Point) obj;
			
			if(this.x == pomocna.x && this.y == pomocna.y)
				return true;
			else 
				return false;
		} else 
			return false;
	}
	
	public boolean contains(int x, int y) {
		return this.distance(x,y) <= 2;
	}
	
	public double distance(int x2, int y2) {
		int dx = x2 - x; // x - x2
		int dy = y2 - y;
		double d = Math.sqrt(dx*dx + dy*dy);
		return d;
	}
	
	// Metode pristupa (GET i SET)
	public int getX() {
		return x;
	}
	public void setX(int novoX) {
		x = novoX;
	}
	public int getY() {
		return y;
	}
	public void setY(int novoY) {
		y = novoY;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean novoSelected) {
		selected = novoSelected;
	}
}
