class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        return func(nums, 0, list);
    }

    public List<List<Integer>> func(int[] nums, int ind, List<List<Integer>> ans) {
        if(ind == nums.length) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int each : nums) {
                list.add(each);
            }

            ans.add(list);
            return ans;
        }
        for(int i = ind; i<nums.length; i++) {
            swap(nums, ind, i);
            func(nums, ind + 1, ans);
            swap(nums, ind, i);
        }

        return ans;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}