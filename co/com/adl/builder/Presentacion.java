package co.com.adl.builder;

public class Presentacion {
	
	public CalculadoraBasica useCalculadoraBasicaBuilder() {
		final ContructorCalculadoraBasica concreteBuilder = new ContructorCalculadoraBasica();
		final DirectorCalculadora director = new DirectorCalculadora(concreteBuilder);
		director.constructBasica();
		return concreteBuilder.getProduct();
	}
	
	public static void main(String[] args) {
		new Presentacion().useCalculadoraBasicaBuilder();
	}
}
