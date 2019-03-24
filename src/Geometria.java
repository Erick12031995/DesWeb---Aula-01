import java.util.ArrayList;


// Nome: Erick Augusto
// Ra: 81523752

public class Geometria {

	public static void main(String[] args) {	
        ArrayList<Figura> fig = new ArrayList<>();
        
		fig.add(new Circulo(5.0));
		fig.add(new Triangulo(2.0, 2.0, 6.0, 6.0));
		fig.add(new Losangulo(6.0,6.0,4.0));
		fig.add(new Trapezio(6.0,6.0,4.0,3.0,3.0));
		
		for(Figura f:fig) {
			System.out.println("�rea: " + f.area());
			System.out.println("Per�metro: " + f.perimetro());	 
		}
		
		 Retangulo r = new Retangulo(4.0,2.0);
		 System.out.println("Diagonal do ret�ngulo: " + r.calcDiagonal() + 
				 "\nArea do Retangulo: " + r.area()+ "  Per�metro do Retangulo: " + r.perimetro());
		 
		 Quadrado a = new Quadrado(2.0,2.0);
		 System.out.println("Diagonal do quadrado : " + a.calcDiagonal()+ 
				 "\nArea do Quadrado: " + a.area() + "  Per�metro do Retangulo: " + a.perimetro());
	}
}
