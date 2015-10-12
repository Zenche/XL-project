package spreadsheet;

import expr.Environment;
import expr.Expr;

public class ExprSlot extends Slot {
	private Expr expr;
	private Environment env; 

	public ExprSlot(Expr expr, Environment env) {
		this.expr = expr;
		this.env = env;
	}

	public double value() { 
		return expr.value(env); 
	}

	public double value(String name) { //Does nothing
		return 0;
	}

	@Override
	public String toString() {
		return expr.toString();
	}

	@Override
	public String formattedToString() {
		return "=" + toString();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
