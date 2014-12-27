package homeworkWeek6;

public class Circle extends GeometricalShapes {

	private double radius;

	public Circle(double radius) {
		super(0, 0 );
		this.radius = radius;
		getVolume();
		getArea();

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	
	public double getVolume() {
		return this.volume = 2 * this.getRadius() * Math.PI;
	}

	public double getArea() {
		return this.area = (this.getRadius() * this.getRadius()) * Math.PI;
	}


	public String toString() {
		String circleToString = "Circle:  r= " + this.getRadius()
				+ "\nVolume= " + this.getVolume() + "\nArea= " + this.getArea();
		return circleToString;

	}

}
