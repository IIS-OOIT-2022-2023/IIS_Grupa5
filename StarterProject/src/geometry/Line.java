package geometry;

public class Line {

	private Point startPoint;
	private Point endPoint;
	private boolean selected;
	
	public Line()  {
		
	}
	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;
	}
	
	public String toString()  {
		return startPoint + " --> " + endPoint;   // (x,y) --> (xE, yE)
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Line) {
			Line pomocna = (Line)obj;
			if(this.startPoint.equals(pomocna.startPoint) 
					&& this.endPoint.equals(pomocna.endPoint))
				return true;
			else
				return false;
		} else 
			return false;
	}
	
	public boolean contains(int x, int y) {
		return this.startPoint.distance(x,y) + this.endPoint.distance(x,y) - lenght() <= 2;
	}
	
	// Duzina linije
	public double lenght() {
		return startPoint.distance(endPoint.getX(), endPoint.getY());
	}
	
	// Metode pristupa 
	public Point getStartPoint() {
		return this.startPoint;
	}
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	public Point getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
	public boolean isSeleceted() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
