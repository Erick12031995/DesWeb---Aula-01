
public class Quadrado extends Poligono implements Diagonal{

	public Quadrado(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return getBase()*getBase();
	}

	@Override
	public double perimetro() {
		return 4*getBase();
	}
	
	@Override
	public double calcDiagonal(){
		 return Math.sqrt(Math.pow(getBase(), 4));
	}

}
