package co.com.adl.builder;

public class DirectorCalculadora {

	private final ConstructorCalculadora constructorCalculadora;

	public DirectorCalculadora(ConstructorCalculadora builder) {
		constructorCalculadora = builder;
	}
	
	public void constructBasica() {
		constructorCalculadora.crearCalculadoraBasica();
		constructorCalculadora.crearControl();
		constructorCalculadora.crearVisual();
		constructorCalculadora.crearComponentes();
	}
}
