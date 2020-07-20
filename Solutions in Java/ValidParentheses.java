/**
 * @author : Anmol Agrawal
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> hm = new HashMap<>();
        hm.put(')','(');
        hm.put('}','{');
        hm.put(']','[');
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if((c == '(') || (c == '{') || (c == '[')){
                stack.push(c);
            }
            else if((c == ')') || (c == '}') || (c == ']')){
                if(stack.empty()){
                    return false;
                }
                if(stack.peek() == hm.get(c)){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
