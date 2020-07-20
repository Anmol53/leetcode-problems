/**
 * @author : Anmol Agrawal
 */
/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    let stack = [];
    let map = new Map();
    map.set(')','(');
    map.set('}','{');
    map.set(']','[');
    for(let i = 0; i < s.length; i++){
        let c = s.charAt(i);
        if((c == '(') || (c == '{') || (c == '[')){
            stack.push(c);
        }
        else if((c == ')') || (c == '}') || (c == ']')){
            if(stack.length === 0){
                return false;
            }
            if(stack[stack.length - 1] == map.get(c)){
                stack.pop();
            }
            else{
                return false;
            }
        }
    }
    return (stack.length === 0);
};