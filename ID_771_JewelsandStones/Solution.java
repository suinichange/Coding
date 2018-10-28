package ID_771_JewelsandStones;

public class Solution {
    public int numJewelsInStones(String J, String S) {
        if (J == null || S == null) return 0;
        int result = 0;
        char[] stones = S.toCharArray();
        char[] jewels = J.toCharArray();
        int sLength = stones.length;
        int jLength = jewels.length;
        for (int i = 0; i < sLength; i++) {
            for (int j = 0; j < jLength; j++) {
                if (stones[i] == jewels[j]) {
                    result++;
                }
            }
        }
        return result;
    }
}
