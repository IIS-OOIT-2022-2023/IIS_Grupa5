package geometry;

public class Test {

	public static void main(String[] args) {
		
		Point point1 = new Point();
		
		//point1.x = 4; 
		//point1.y = 5; Nije ispravno zbog specifikatora pristupa PRIVATE
		
		point1.setX(4);
		point1.setY(5);
		point1.setSelected(false);
		
		System.out.println("X koordinata: " + point1.getX());  
		System.out.println("Y koordinata: " + point1.getY());  
		System.out.println("Selected: " + point1.isSelected());
		
		double distanceResult = point1.distance(8,7);
		System.out.println(distanceResult);

	}

}
