import java.util.NoSuchElementException;

public class ParenMatch {
	/*
	 *  Returns true if parenthesis or square brackers are matched int expr
	 */
	public static boolean parenMatch (String expr) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < expr.length(); i++) {
			char in = expr.charAt(i);
			if (in == '(' || in == '[') {
				stack.push(in);
			} else if (in == ')' || in == ']') {
				try {
					char out = stack.pop();
					
					if (in == ')' && out == '(') {
						continue;
					} else if (in == ']' && out =='[') {
						continue;
					} else {
						return false;
					}
					
				} catch (NoSuchElementException e) {
					// stack is empty, expr is not matched
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String expr1 = "[(a-b)*c]*[(a-b) * (b+c)]";
		String expr2 = "((a-b)";
		String expr3 = "[a-b)";
		String expr4 = "a-b)";
		
		if (parenMatch(expr1)) {
			System.out.println(expr1 + " Matched");
		} else {
			System.out.println(expr1 + " Not matched");
		}

		if (parenMatch(expr2)) {
			System.out.println(expr2 + " Matched");
		} else {
			System.out.println(expr2 + " Not matched");
		}

		if (parenMatch(expr3)) {
			System.out.println(expr3 + " Matched");
		} else {
			System.out.println(expr3 + " Not matched");
		}

		if (parenMatch(expr4)) {
			System.out.println(expr4 + " Matched");
		} else {
			System.out.println(expr4 + " Not matched");
		}
		
	}

}
