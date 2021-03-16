//Your job is to create a calculator which evaluates expressions in Reverse Polish notation.
//
//For example expression 5 1 2 + 4 * + 3 - (which is equivalent to 5 + ((1 + 2) * 4) - 3 in normal notation)
//should evaluate to 14.
//
//For your convenience, the input is formatted such that a space is provided between every token.
//
//Empty expression should evaluate to 0.
//
//Valid operations are +, -, *, /.
//
//You may assume that there won't be exceptional situations (like stack underflow or division by zero).

import java.util.Stack;

public class Calc {

  public double evaluate(String expr) {
    if (expr.isEmpty()) {
      return 0;
    }
    String in[] = expr.split(" ");
    Stack<Double> stack = new Stack<>();
    for (int i = 0; i < in.length; i++) {
      if (isNumber(in[i])) {
        stack.push(Double.parseDouble(in[i]));
      } else {
        double upper = stack.pop();
        double lower = stack.pop();
        switch (in[i]) {
            case "+" : stack.push(lower + upper); break;
            case "-" : stack.push(lower - upper); break;
            case "*" : stack.push(lower * upper); break;
            case "/" : stack.push(lower / upper); break;
        }
      }
    }
    if (!stack.isEmpty()) {
      return stack.pop();
    }
    return 0;
  }
  private boolean isNumber(String s) {
    try {
      Double.parseDouble(s);
      return true;
    } catch (NumberFormatException ex) {
      return false;
    }
  } 
}