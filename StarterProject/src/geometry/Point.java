package geometry;

public class Point {

	private int x;
	private int y;
	private boolean selected;
	
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
