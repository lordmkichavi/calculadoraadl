package co.com.adl.command;

import co.com.adl.builder.Pantalla;
import co.com.adl.interpreter.operaciones.Calculator;

public class Receptor {

	private Calculator calculator;
	private static Receptor receptor;
	
	private Receptor() { }
	
	public static Receptor getReceiver(){
		if(receptor == null){
			receptor = new Receptor();
		}
		return receptor;
	}
	
	public void action() {
		Pantalla pantalla = Pantalla.getDisplay();
		calculator = new Calculator();
		double resultado = calculator.calculator(pantalla.getText());
		System.out.println(" Result = " + resultado);
		pantalla.setText(String.valueOf(resultado)); 
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
}
