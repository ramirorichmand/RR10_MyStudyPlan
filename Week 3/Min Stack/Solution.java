class MinStack {
    private Stack<Pair<Integer, Integer>> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new Pair<>(val, val));
        } else {
            int min = Math.min(stack.peek().getValue(), val);
            stack.push(new Pair<>(val, min));
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    public int top() {
        if (stack.isEmpty()) {
            return 0;
        }
        return stack.peek().getKey();
    }

    public int getMin() {
        if (stack.isEmpty()) {
            return 0;
        }
        return stack.peek().getValue();
    }
}