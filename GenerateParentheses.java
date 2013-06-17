public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (n == 0)
            return null;
        StringBuilder sb = new StringBuilder(2 * n);
        int curOpen = 1;
        sb.append("(");
        ArrayList<String> as = new ArrayList<String>();
        addP(n, as, sb, curOpen);
        return as;
    }
    
    private void addP(int n, ArrayList<String> as, StringBuilder sb, int curOpen) {
        if (sb.length() == 2 * n - 1) {
            as.add(sb.toString() + ")");
            return;
        }
        if (curOpen < n) {
            sb.append("(");
            curOpen++;
            addP(n, as, sb, curOpen);
            sb.deleteCharAt(sb.length() - 1);
            curOpen--;
        }
        if (curOpen > sb.length() / 2) {
            sb.append(")");
            addP(n, as, sb, curOpen);
            sb.deleteCharAt(sb.length() - 1);
        }
        return;
    }
}