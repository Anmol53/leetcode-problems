/**
 * @author : Anmol Agrawal
 */
/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
var addBinary = function(a, b) {
    var ans = "";
    var carry = 0;
    var i = a.length - 1, j = b.length - 1;
    while(i >= 0 && j >= 0){
        var add = parseInt(a.charAt(i)) + parseInt(b.charAt(j)) + carry;
        if(add === 3){
            carry = 1;
            ans = "1" + ans;
        }
        else if(add === 2){
            carry = 1;
            ans = "0" + ans;
        }
        else if(add === 1){
            carry = 0;
            ans = "1" + ans;
        }
        else {
            carry = 0;
            ans = "0" + ans;
        }
        i--;
        j--;
    }
    while(i >= 0){
        var add = parseInt(a.charAt(i)) + carry;
        if(add === 2){
            carry = 1;
            ans = "0" + ans;
        }
        else if(add === 1){
            carry = 0;
            ans = "1" + ans;
        }
        else {
            carry = 0;
            ans = "0" + ans;
        }
        i--;
    }
    while(j >= 0){
        var add = parseInt(b.charAt(j)) + carry;
        if(add === 2){
            carry = 1;
            ans = "0" + ans;
        }
        else if(add === 1){
            carry = 0;
            ans = "1" + ans;
        }
        else {
            carry = 0;
            ans = "0" + ans;
        }
        j--;
    }
    if(carry === 1){
        ans = "1" + ans;
    }
    return ans;
};