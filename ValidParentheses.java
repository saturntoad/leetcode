public class Solution {
    public boolean isValid(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (s == null || s.length() == 0)
            return true;
        if (s.length() % 2 == 1)
            return false;
        LinkedList<Character> stack = new LinkedList<Character>();
        for (int i = 0 ; i < s.length() ; ++i) {
            switch (s.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    stack.push(s.charAt(i));
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(')
                        return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{')
                        return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[')
                        return false;
                    break;
                default:
                    return false;
            }
        }
        if (stack.isEmpty())
            return true;
        return false;
    }
}