class Solution {
    public boolean backspaceCompare(String s, String t) {
        return reduceString(s).equals(reduceString(t));
    }

    private Stack<Character> reduceString(String string) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if (currentChar == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(currentChar);
            }
        }
        return stack;
    }
}