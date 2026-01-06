class Solution {
    public long interchangeableRectangles(int[][] rectangles) {

        Map<Double, Long> map = new HashMap<>();
        long ans = 0;

        for(int[] each : rectangles) {
            double x = each[0];
            double y = each[1];

            double div = (double) x / y;
            if(map.containsKey(div)) {
                ans+= map.get(div);
            }
            map.put(div, map.getOrDefault(div, 0L) + 1);
        }

        return ans;
    }
}