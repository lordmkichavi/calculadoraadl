package co.com.adl.command;

public class Invocador {

	private IComando iComando;

	public Invocador() {
		super();
	}

	public void almacenarComando(IComando cmd) {
		iComando = cmd;
		ejecutar();
	}
	
	public void ejecutar() {
		iComando.ejecutar();
	}
}
