class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                int[] result = new int[] {i, map.get(difference)};
                Arrays.sort(result);
                return result;
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] {0, 1};
    }
}
