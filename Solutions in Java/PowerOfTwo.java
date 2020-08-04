/**
 * @author : Anmol Agrawal
 */
/** Solution 1
*   With Loops
*    class Solution {
*        public boolean isPowerOfTwo(int n) {
*            while(n > 1){
*                if(n % 2 == 0) n /= 2;
*                else return false;
*            }
*            return (n == 1) ? true : false;
*        }
*    }
*/

/** Solution 2
*   Without Loops
*/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        if(n == 1) return true;
        String s = Integer.toBinaryString(n).substring(1);
        return Integer.parseInt(s, 2) == 0;
    }
}

