
public class Cubo extends Volume {
	private double altura;
	private double largura;
	private double comprimento;
	
	public Cubo(double altura, double largura, double comprimento) {
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
	}

	@Override
	public double volume() {
		double volume = 0;
		volume = altura*largura*comprimento;
		return volume;
	}
}