/**
 * @author : Anmol Agrawal
 */
class Solution {
    public int nthUglyNumber(int n) {
        List<Integer> uglys  = new ArrayList<>();
        uglys.add(1);
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        while(uglys.size() < n){
            int next = (int) Math.min(Math.min(uglys.get(i2) * 2, uglys.get(i3) * 3), uglys.get(i5)* 5);
            if(next == uglys.get(i2) * 2){
                i2++;
            }
            if(next == uglys.get(i3) * 3){
                i3++;
            }
            if(next == uglys.get(i5) * 5){
                i5++;
            }
            uglys.add(next);
        }
        return uglys.get(n-1);
    }
}
