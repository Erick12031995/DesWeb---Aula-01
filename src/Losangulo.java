
public class Losangulo extends Poligono {
	private double lado;
	public Losangulo(double base, double altura, double lado) {
		super(base, altura);
		this.lado = lado;
	}

	@Override
	public double area() {
		return getBase()*getAltura()/2;
	}

	@Override
	public double perimetro() {
		return 4*lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

}
