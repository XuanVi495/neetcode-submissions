class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 1) {
            return new ArrayList<>(List.of(new ArrayList<>(List.of(strs[0]))));
        }
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int[] count = new int[26];
            for (int j = 0; j < strs[i].length(); j++) {
                count[strs[i].charAt(j) - 'a']++;
            }
            map.computeIfAbsent(Arrays.toString(count), k -> new ArrayList<>()).add(strs[i]);
        }
        List<List<String>> list = new ArrayList<>();
        map.forEach((key, values) -> { list.add(values); });
        return list;
    }
}
