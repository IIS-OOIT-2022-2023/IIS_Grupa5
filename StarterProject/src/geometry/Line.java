package geometry;

public class Line {

	private Point startPoint;
	private Point endPoint;
	private boolean selected;
	
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
