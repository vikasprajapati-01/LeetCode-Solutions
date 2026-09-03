class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> ans = new ArrayList<>();

        for (int[] each : intervals) {
            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < each[0]) {
                ans.add(each);
            }
            else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], each[1]);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}