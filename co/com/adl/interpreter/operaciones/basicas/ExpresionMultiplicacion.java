package co.com.adl.interpreter.operaciones.basicas;
import co.com.adl.interpreter.operaciones.Expression;
import co.com.adl.interpreter.operaciones.SymbolExpression;

public class ExpresionMultiplicacion extends SymbolExpression {
	
	public ExpresionMultiplicacion(Expression left, Expression right){
        super(left, right);
    }

	@Override
    public double interpret() {
        return left.interpret() * right.interpret();
    }
}  
