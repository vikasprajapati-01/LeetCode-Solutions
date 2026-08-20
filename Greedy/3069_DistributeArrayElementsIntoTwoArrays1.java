class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();

        a1.add(nums[0]);
        a2.add(nums[1]);

        for(int i = 2; i<n; i++) {
            if(a1.getLast() > a2.getLast()) {
                a1.add(nums[i]);
            }
            else {
                a2.add(nums[i]);
            }
        }

        int size1 = a1.size();
        int size2 = a2.size();
        for(int i = 0; i < size1 + size2; i++) {
            if(i < size1) {
                nums[i] = a1.get(i);
            }
            else {
                nums[i] = a2.get(i - size1);
            }
        }

        return nums;

        // a1.addAll(a2);
        // return a1.stream().mapToInt(Integer::intValue).toArray();
    }
}