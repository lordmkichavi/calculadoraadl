package co.com.adl.builder;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import co.com.adl.command.*;
import co.com.adl.util.Constantes;

public class BotonCalculadora extends JButton implements ActionListener {

	private static final long serialVersionUID = 805870779265348995L;

	private static Pantalla pantalla;
	private static Cliente cliente;
	static String contenido;
	private String operacion;
	IComando iComando;

	public BotonCalculadora() {
		contenido = new String();
		addActionListener(this);
		setBackground(new Color(187, 238, 247));
	}

	public void asignarComando(IComando iComando){
		this.iComando = iComando;	
	}

	public void actionPerformed(ActionEvent eventoBoton) {
		pantalla = Pantalla.getDisplay();
		operacion = eventoBoton.getActionCommand().replace("+", " + ").replace("-", " - ").replace("/", " / ").replace("X", " X ");
		if (operacion == Constantes.IGUAL){
			cliente = Cliente.getClient();
			cliente.initConcreteCommand();
		}
		else if(operacion == Constantes.LIMPIAR){
			pantalla.setText(null);
			contenido = " ";
		} else {
			contenido = contenido + operacion;
			pantalla.setText(contenido);
		}
	}

	public static Cliente getCliente() {
		return cliente;
	}

	public static String getContenido() {
		return contenido;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
}
