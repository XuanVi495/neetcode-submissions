class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            Integer prevIndex = map.get(difference);
            if (prevIndex != null) {
                return new int[] {prevIndex, i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] {0, 1};
    }
}
