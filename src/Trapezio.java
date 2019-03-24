
public class Trapezio extends Poligono {

	private double basemenor;
	
	private double lado1,lado2; 
	
	public Trapezio(double base, double altura, double basemenor, double lado1, double lado2) {
		super(base, altura);
		this.basemenor=basemenor;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	@Override
	public double perimetro() {
		return getLado1()+getLado2()+getBasemenor()+getBase();
	}
	
	@Override
	public double area() {
		return getAltura()*(getBase()+getBasemenor())/2;
	}
	
	public double getBasemenor() {
		return basemenor;
	}
	public void setBasemenor(double basemenor) {
		this.basemenor = basemenor;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	
	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
}
