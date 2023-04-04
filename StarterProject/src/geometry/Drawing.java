package geometry;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {

	/**
	 * Create the panel.
	 */
	public Drawing() {

	}
	
	public static void main(String []args) {
		JFrame frame = new JFrame("Drawing");
		frame.setSize(800,600);
		Drawing drawing = new Drawing();
		frame.getContentPane().add(drawing);
		frame.setVisible(true);
	}
	public void paint(Graphics g) {
		Point p1 = new Point(40,50);
		p1.draw(g);
		
		Line l1 = new Line(p1,new Point(110,70));
		l1.draw(g);
		
		g.setColor(Color.RED);
		Circle c1 = new Circle(new Point(50,200), 35);
		c1.draw(g);
		
		Rectangle r1 = new Rectangle(new Point(150, 200), 40,40);
		r1.draw(g);
		
		g.setColor(Color.GREEN);
		Donut d1 = new Donut(new Point(200,300), 50, 30);
		d1.draw(g);
		
		
	}
	

}
