class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++) {
            int cur = nums[i];
            int rem = target - cur;

            if(map.containsKey(rem)) {
                return new int[]{map.get(rem), i};
            }
            map.put(cur, i);
        }

        return new int[]{-1, -1};
    }
}