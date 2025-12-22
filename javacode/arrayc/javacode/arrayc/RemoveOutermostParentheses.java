

public class RemoveOutermostParentheses {

    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (balance > 0) {
                    result.append(c);
                }
                balance++;
            } else { // c == ')'
                balance--;
                if (balance > 0) {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        RemoveOutermostParentheses solution = new RemoveOutermostParentheses();

        // Test cases
        System.out.println("Input: \"(()())\" Output: \"" + solution.removeOuterParentheses("(()())") + "\" Expected: \"()()\"");
        System.out.println("Input: \"()()\" Output: \"" + solution.removeOuterParentheses("()()") + "\" Expected: \"\"");
        System.out.println("Input: \"()(())\" Output: \"" + solution.removeOuterParentheses("()(())") + "\" Expected: \"()\"");
        System.out.println("Input: \"(()(()))\" Output: \"" + solution.removeOuterParentheses("(()(()))") + "\" Expected: \"()(())\"");
    }
}
