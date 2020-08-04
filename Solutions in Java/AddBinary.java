/**
 * @author : Anmol Agrawal
 */
class Solution {
    public String addBinary(String a, String b) {
        String ans = "";
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while(i >= 0 && j >= 0){
            int add = (a.charAt(i) - '0') + (b.charAt(j) - '0') + carry;
            if(add == 3){
                carry = 1;
                ans = "1" + ans;
            }
            else if(add == 2){
                carry = 1;
                ans = "0" + ans;
            }
            else if(add == 1){
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
            int add = (a.charAt(i) - '0') + carry;
            if(add == 2){
                carry = 1;
                ans = "0" + ans;
            }
            else if(add == 1){
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
            var add = (b.charAt(j) - '0') + carry;
            if(add == 2){
                carry = 1;
                ans = "0" + ans;
            }
            else if(add == 1){
                carry = 0;
                ans = "1" + ans;
            }
            else {
                carry = 0;
                ans = "0" + ans;
            }
            j--;
        }
        if(carry == 1){
            ans = "1" + ans;
        }
        return ans;
    }
}