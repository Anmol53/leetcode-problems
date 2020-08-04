/**
 * @author : Anmol Agrawal
 */
class MinStack {
    Stack<Integer> min = new Stack<Integer>();
    Stack<Integer> main = new Stack<Integer>();
    public MinStack() {
        min.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        main.push(x);
        if(x <= min.peek()){
            min.push(x);
        }
    }

    public void pop() {
        if(main.peek().intValue() == min.peek().intValue()){
            min.pop();
        }
        main.pop();
    }

    public int top() {
        return main.peek();
    }

    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */