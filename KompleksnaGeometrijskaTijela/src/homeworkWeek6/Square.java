package homeworkWeek6;

public class Square extends Rectangle {
	
	public Square(double siteA) {
		super(siteA, siteA);
		getVolume();
		getArea();

	}
	
	@Override
	public void setSiteA(double a) {
		super.setSiteA(a);
		super.setSiteB(a);
	}
	@Override
	public void setSiteB(double a) {
		super.setSiteA(a);
		super.setSiteB(a);
	}
	
	@Override
	public String toString() {
		String out = "Square:  a=" + this.getSiteA() + "\nArea=" + this.getArea() + "\nVolume=" + this.getVolume() + " }";
		return out;
	}
	
}
