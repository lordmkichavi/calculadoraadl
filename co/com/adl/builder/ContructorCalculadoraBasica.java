package co.com.adl.builder;

public class ContructorCalculadoraBasica extends ConstructorCalculadora {

	private CalculadoraBasica calculadoraBasica = new CalculadoraBasica();

	public ContructorCalculadoraBasica() { }
	
	public void crearControl() {
		calculadoraBasica.establecerPropiedadesVentana();
		calculadoraBasica.inicializarComponentes();
	}
	
	public void crearComponentes() {
		calculadoraBasica.adicionarComponentes();
		calculadoraBasica.establecerTextos();
	}
	
	public void crearVisual() {
		calculadoraBasica.ejecutarVentana();
		calculadoraBasica.establecerAspecto();
	}
	
	public CalculadoraBasica getProduct() {
		return calculadoraBasica;
	}
}
