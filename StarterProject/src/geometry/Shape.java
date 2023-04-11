package geometry;

import java.awt.Graphics;

public abstract class Shape implements Moveable, Comparable{

	protected boolean selected;
	
	// deklarisanje apstraktnih metoda
	public abstract boolean contains(int x, int y);
	public abstract void draw(Graphics g);
	
	public Shape() {
		
	}
	public Shape(boolean selected) {
		this.selected = selected;
	}
	
	public boolean isSeleceted() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
	
	
}
