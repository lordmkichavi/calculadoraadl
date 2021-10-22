package co.com.adl.interpreter.operaciones;

import co.com.adl.interpreter.operaciones.basicas.ExpresionDivision;
import co.com.adl.interpreter.operaciones.basicas.ExpresionMultiplicacion;
import co.com.adl.interpreter.operaciones.basicas.ExpresionResta;
import co.com.adl.interpreter.operaciones.basicas.ExpresionSuma;
import co.com.adl.util.Constantes;

public class Calculator {

	public double calculator(String statement){
		Expression left;
		Expression right;
		Expression now = null;
		String[] strs = statement.split(" ");
		for(int i=0;i<strs.length;i++) {
			if(Constantes.SUMA.equals(strs[i])){
				left = now; 
				right = new ValueExpression(Double.parseDouble(strs[++i]));
				now = new ExpresionSuma(left, right); 
			} else if(Constantes.RESTA.equals(strs[i])){
				left = now;
				right = new ValueExpression(Double.parseDouble(strs[++i]));
				now = new ExpresionResta(left, right);
			} else if(Constantes.MULTIPLICACION.equals(strs[i])){
				left = now;
				right = new ValueExpression(Double.parseDouble(strs[++i]));
				now = new ExpresionMultiplicacion(left, right);
			} else if(Constantes.DIVISION.equals(strs[i])){
				left = now;
				right = new ValueExpression(Double.parseDouble(strs[++i]));
				now = new ExpresionDivision(left, right);
			}else{
				now = new ValueExpression(Double.parseDouble(strs[i]));
			}
		}
		return now.interpret();
	}
}