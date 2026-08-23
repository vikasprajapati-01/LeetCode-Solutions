class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        funcOpt(nums, 0, ans);

        return ans;
        
        // Brute -----------------------------------------

        // Set<List<Integer>> set = new HashSet<>();
        // func(nums, 0, set);

        // return new ArrayList<>(set);
    }

    public void funcOpt(int[] nums, int ind, List<List<Integer>> list) {
        if(ind == nums.length) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int each : nums) {
                temp.add(each);
            }
            list.add(temp);

            return;
        }

        Set<Integer> set = new HashSet<>();
        for(int i = ind; i<nums.length; i++) {
            if(set.contains(nums[i])) {
                continue;
            }
            set.add(nums[i]);

            swap(nums, i, ind);
            funcOpt(nums, ind + 1, list);
            swap(nums, i, ind);
        }
    }

    // public void func(int[] nums, int ind, Set<List<Integer>> set) {
    //     if(ind == nums.length) {
    //         List<Integer> temp = new ArrayList<>();

    //         for(int each : nums) {
    //             temp.add(each);
    //         }
    //         set.add(temp);

    //         return;
    //     }

    //     for(int i = ind; i < nums.length; i++) {
    //         swap(nums, i, ind);
    //         func(nums, ind + 1, set);
    //         swap(nums, i, ind);
    //     }
    // }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}