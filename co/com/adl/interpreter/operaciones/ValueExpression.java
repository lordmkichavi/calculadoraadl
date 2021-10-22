package co.com.adl.interpreter.operaciones;

public class ValueExpression extends Expression {

    private double value;
    
    @Override
    public double interpret() {
        return this.value;
    }

    public ValueExpression(double value){
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}