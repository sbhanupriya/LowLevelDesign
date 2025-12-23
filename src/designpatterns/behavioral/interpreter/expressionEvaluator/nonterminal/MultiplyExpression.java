package designpatterns.behavioral.interpreter.expressionEvaluator.nonterminal;

import designpatterns.behavioral.interpreter.expressionEvaluator.Context;
import designpatterns.behavioral.interpreter.expressionEvaluator.Expression;

public class MultiplyExpression implements Expression {
    private Expression left;
    private Expression right;
    public MultiplyExpression(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    @Override
    public int interpret(Context context) {
        return left.interpret(context) * right.interpret(context);
    }
}
