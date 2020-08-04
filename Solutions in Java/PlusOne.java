/**
 * @author : Anmol Agrawal
 */
class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length - 1; i >= 0; i--){
            int a = digits[i] + carry;
            digits[i] = a % 10;
            carry = a / 10;
            carry = (int)Math.floor(carry);
            if(carry == 0){
                break;
            }
        }
        if(carry > 0){
            int[] temp = new int[digits.length + 1];
            temp[0] = carry;
            return temp;
        }
        return digits;
    }
}