package arraysdeobjetos.arraypuntos;

public class ArrayPuntos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point points [] = new Point[3];
		points[0] = new Point(3, 7);
		points[1] = new Point(4, 5);
		points[2] = new Point(6, 2);
		
		
		for(Point point : points ) {
			
			System.out.println(point);
		}
		
		
		System.out.println(points[1]);


	}

}
