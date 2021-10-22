package co.com.adl.command;

public class Cliente {

	private static Receptor fReceiver;
	private static Cliente cliente;
	private Invocador invocador;
	private Comando comando;

	private Cliente(Receptor receptor) {
		fReceiver = receptor;
	}

	public static Cliente getClient(){
		if(cliente == null) {
			fReceiver = Receptor.getReceiver();
			cliente = new Cliente(fReceiver);
		}
		return cliente;
	}

	public void initConcreteCommand() {
		comando = new Comando(fReceiver);
		invocador = new Invocador();
		invocador.almacenarComando(comando);
	}

	public Invocador getInvocador() {
		return invocador;
	}

	public void setInvocador(Invocador invocador) {
		this.invocador = invocador;
	}

	public Comando getComando() {
		return comando;
	}

	public void setComando(Comando comando) {
		this.comando = comando;
	}
}
