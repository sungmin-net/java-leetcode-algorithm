// https://leetcode.com/problems/1-bit-and-2-bit-characters/

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int idx = 0;
        while (idx < bits.length - 1) {
            if (bits[idx] == 1) {
                idx += 2;
            } else {
                idx += 1;
            }
        }
        return idx == bits.length - 1;
    }
}