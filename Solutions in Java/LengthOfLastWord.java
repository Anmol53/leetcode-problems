/**
 * @author : Anmol Agrawal
 */
class Solution {
    public int lengthOfLastWord(String s) {
        String[] sp = s.trim().split(" ");
        return sp[sp.length - 1].length();
    }
}