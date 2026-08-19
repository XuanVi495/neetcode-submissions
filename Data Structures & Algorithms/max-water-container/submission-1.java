class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxContainer = 0;
        while (left < right) {
            int currentAmount = (right - left) * Math.min(heights[left], heights[right]);
            maxContainer = Math.max(maxContainer, currentAmount);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxContainer;
    }
}
