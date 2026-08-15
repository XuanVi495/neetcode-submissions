class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            char charAtLeft = s.charAt(left);
            char charAtRight = s.charAt(right);
            while (!Character.isLetterOrDigit(charAtLeft)) {
                if (left < right) {
                    left++;
                    charAtLeft = s.charAt(left);
                } else
                    break;
            }
            while (!Character.isLetterOrDigit(charAtRight)) {
                if (left < right) {
                    right--;
                    charAtRight = s.charAt(right);
                } else
                    break;
            }
            if (Character.toLowerCase(charAtLeft) != Character.toLowerCase(charAtRight))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
