package homeworkWeek6;

public class TestGeometricalShapes {
public static void main(String[] args) {
		
		Circle krug = new Circle(1);
		System.out.println(krug + "\n");
		
		Rectangle pravouganik = new Rectangle(2, 2);
		System.out.println(pravouganik + "\n");
		
		Square kocka = new Square(4);
		System.out.println(kocka+ "\n");
	
	
		ComplexGeometricalShapes loc1 = new ComplexGeometricalShapes("Lokomotiva");
		loc1.addPart(new Circle(2));
		loc1.addPart(new Circle(2));
		loc1.addPart(new Circle(2));
		loc1.addPart(new Rectangle(10 , 4));
		loc1.addPart(new Square(4));
		loc1.addPart(new Square(10));
		
		ComplexGeometricalShapes V1 = new ComplexGeometricalShapes("Prvi vagon");
		V1.addPart(new Circle(2));
		V1.addPart(new Circle(2));
		V1.addPart(new Rectangle(10, 4));
		
		ComplexGeometricalShapes V2 = new ComplexGeometricalShapes("Drugi vagon");
		V2.addPart(new Circle(2));
		V2.addPart(new Circle(2));
		V2.addPart(new Rectangle(10, 4));
		
		ComplexGeometricalShapes voz = new ComplexGeometricalShapes("voz");
		voz.addPart(loc1);
		voz.addPart(V1);
		voz.addPart(V2);
		
		
		
		System.out.printf("ukupna povrsina voza " +voz.getName()+ " is: %.2f\n", voz.area);
		System.out.printf("Ukupni obim voza " +voz.getName()+ " is: %.2f\n", voz.volume);
		System.out.println(voz);
		
		
		
		
		
		
		
		
		}
		
		

	
	
}
