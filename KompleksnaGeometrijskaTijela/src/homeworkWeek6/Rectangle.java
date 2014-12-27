package homeworkWeek6;

public class Rectangle extends GeometricalShapes {

	private double siteA;
	private double siteB;
	
	public Rectangle(double siteA, double siteB){
		super(0, 0);
		this.siteA = siteA;
		this.siteB = siteB;
		getVolume();
		getArea();

		
	}
	
	public double getSiteB() {
		return siteB;
	}


	public void setSiteB(double siteB) {
		this.siteB = siteB;
	}


	public double getSiteA() {
		return siteA;
	}


	public void setSiteA(double siteA) {
		this.siteA = siteA;
	}
	
	public double getVolume() {
		return this.volume = getSiteA() * 2  + getSiteB() * 2;
		
	}
	
	public double getArea() {
		return this.area = getSiteA() * getSiteB();
		
	}

	public String toString() {
		String rectangleToString = "Rectangle: siteA=" + siteA + "\nsiteB= " + siteB + "\nVolume: " + getVolume() + "\nArea: " + getArea();
		return rectangleToString;
	}
	
	
}
