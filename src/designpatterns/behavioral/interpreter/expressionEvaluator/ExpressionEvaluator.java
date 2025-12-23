package designpatterns.behavioral.interpreter.expressionEvaluator;

import designpatterns.behavioral.interpreter.expressionEvaluator.nonterminal.AddExpression;
import designpatterns.behavioral.interpreter.expressionEvaluator.nonterminal.MultiplyExpression;
import designpatterns.behavioral.interpreter.expressionEvaluator.terminal.NumericalExpression;

public class ExpressionEvaluator {
    public static void main(String[] args){
        Expression expression = new MultiplyExpression(
                new AddExpression(new NumericalExpression("a"), new NumericalExpression("b")),
                new MultiplyExpression(new NumericalExpression("c"), new NumericalExpression("d"))
        );
        Context context = new Context();
        context.add("a", 5);
        context.add("b", 2);
        context.add("c", 1);
        context.add("d", 2);
        System.out.println(expression.interpret(context));
    }
}
