package co.com.adl.builder;

public abstract class ConstructorCalculadora {

	protected CalculadoraBasica calculadoraBasica;

	public CalculadoraBasica obtenerCalculadoraBasica() {
		return calculadoraBasica;
	}
	
	public void crearCalculadoraBasica() {
		calculadoraBasica = new CalculadoraBasica();
	}

	public abstract void crearControl();
	public abstract void crearVisual();
	public abstract void crearComponentes();
}
