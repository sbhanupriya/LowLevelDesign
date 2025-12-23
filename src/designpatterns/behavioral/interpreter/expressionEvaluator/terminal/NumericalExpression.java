package designpatterns.behavioral.interpreter.expressionEvaluator.terminal;

import designpatterns.behavioral.interpreter.expressionEvaluator.Context;
import designpatterns.behavioral.interpreter.expressionEvaluator.Expression;

public class NumericalExpression implements Expression {
    private String field;
    public NumericalExpression(String key){
        this.field = key;
    }

    @Override
    public int interpret(Context context) {
        return  context.get(field);
    }
}
