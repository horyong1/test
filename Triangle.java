package day0801;

public class Triangle {
	int x1,y1,x2,y2,x3,y3;
	
	public Triangle() {
		
	}

	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}
	public void printG() {
		double g1 = (double)(x1+x2+x3)/3;
		double g2 = (double)(y1+y2+y3)/3;
		
		System.out.printf("(%.1f , %.1f)" , g1,g2);
	}
	
}
