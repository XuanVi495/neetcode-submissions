class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length == 0) return false;
    Arrays.sort(nums);
    int prevValue = nums[0]; 
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == prevValue) return true;
      prevValue = nums[i];
    }
    return false;
    }
}