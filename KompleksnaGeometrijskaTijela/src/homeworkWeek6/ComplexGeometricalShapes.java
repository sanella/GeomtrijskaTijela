package homeworkWeek6;

import java.util.Arrays;

public class ComplexGeometricalShapes extends GeometricalShapes {

	GeometricalShapes[] parts = new GeometricalShapes[2];
	protected int numParts;
	protected String name;
	
	
	public ComplexGeometricalShapes(String name) {
		super(0, 0);
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}

	
	public void addPart(GeometricalShapes shape) {
		if(numParts == parts.length) {
			resizeParts();
		}
		parts[numParts++] = shape;
		area += shape.area;
		volume += shape.volume;	
	}
	
	
	public GeometricalShapes[] resizeParts() {
		GeometricalShapes[] temp = new GeometricalShapes[numParts*2];
		for(int i=0; i<numParts; i++) {
			temp[i] = parts[i];
		}
		return parts = temp;
	}
	
	
	public String toString() {
		String str = "";
		str += "Parts complex geometrical shape: " + name + "\n";
		for(int i=0; i<numParts; i++) {
			str += parts[i].toString()+"\n";
		}
		str += "\n"+name+"'s area: " + area + "\n" + name +"'s volume: "+volume+"\n";
		return str;
	}
}