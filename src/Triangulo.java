
public class Triangulo extends Poligono {
	private double lado1, lado2;

	public Triangulo(double base, double altura, double lado1, double lado2) {
		super(base, altura);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public double area() {
		return getBase() * getAltura() / 2;
	}

	@Override
	public double perimetro() {
		return getLado1() + getLado2() + getBase();
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
