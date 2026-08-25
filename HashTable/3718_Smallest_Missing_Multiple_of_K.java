class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for(int each : nums) {
            if(each % k == 0) {
                set.add(each);
            }
        }

        for(int i = 1; i <= set.size() + 1;i++) {
            if(!set.contains(k * i)) {
                return k * i;
            }
        }

        return -1;

        // for(int each : nums) {
        //     set.add(each);
        // }

        // for(int i = 1; i<200;i++) {
        //     if(!set.contains(k * i)) {
        //         return k * i;
        //     }
        // }

        // return -1;
    }
}