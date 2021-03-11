class Solution {
    public void reverseString(char[] s) {
        int right = s.length - 1;
        int left = 0;
        while (left < right) {
            char tmp = s[right];
            s[right] = s[left];
            s[left] = tmp;
            left++;
            right--;
        }
    }
}
