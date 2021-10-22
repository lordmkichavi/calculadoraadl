package co.com.adl.command;

public class Comando implements IComando {

	private final Receptor receptor;

	public Comando(Receptor receptor) {
		super();
		this.receptor = receptor;
	}
	
	public void ejecutar() {
		receptor.action();
	}
}
