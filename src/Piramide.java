public class Piramide extends Volume {

	private double altura;
	private double largura;

	public Piramide(double altura, double largura) {
		this.altura = altura;
		this.largura = largura; 
	}

	@Override
	public double volume() {
		 
		double volume = 0;
		volume = Math.pow(largura,2)* altura /3 ;
		return volume;
	}
}