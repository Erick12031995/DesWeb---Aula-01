
public class Circulo extends Figura {
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return 3.141516*Math.pow(raio, 2);
	}

	@Override
	public double perimetro() {
		return 2*3.141516*raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

}
