public class Esfera extends Volume {
    private double raio;	
	public Esfera(double raio){
		this.raio=raio;
	}
	@Override
	public double volume(){
		// TODO Auto-generated method stub
		double volume;
		volume = (4*3.14*Math.pow(raio, 3))/3;
	    return volume;	
	}

}