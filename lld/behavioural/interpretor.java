
public interface AbstractExpression {
    public int interpret(Context context);
}


public class TerminalExpression implements AbstractExpression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public int interpret(Context context) {
        return context.get(data);
    }
}

public class NotTerminalExpression implements AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;

    public NotTerminalExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}

public class MultiplyNotTerminalExpression implements AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;

    public MultiplyNotTerminalExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    public int interpret(Context context) {
        return left.interpret(context) * right.interpret(context);
    }
}

public class BinaryNotTerminalExpression implements AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;
    private Char operator;

    public BinaryNotTerminalExpression(AbstractExpression left, AbstractExpression right, Char operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public int interpret(Context context) {
        switch(operator) {
            case '+':
                return left.interpret(context) + right.interpret(context);
            case '-':
                return left.interpret(context) - right.interpret(context);
            case '*':
                return left.interpret(context) * right.interpret(context);
            case '/':
                return left.interpret(context) / right.interpret(context);
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}

public class Context {
    private Map<String, Integer> map = new HashMap<String, Integer>();

    public void put(String key, int value) {
        map.put(key, value);
    }

    public int get(String key) {
        return map.get(key);
    }
}

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.put("a", 5);
        context.put("b", 10);
        context.put("c", 15);

        AbstractExpression a = new TerminalExpression("a");
        AbstractExpression b = new TerminalExpression("b");
        AbstractExpression c = new TerminalExpression("c");

        AbstractExpression expression = new NotTerminalExpression(a, new MultiplyNotTerminalExpression(b, c));

        System.out.println(expression.interpret(context));
    }
}