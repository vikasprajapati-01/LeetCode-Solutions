class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String each : strs) {
            char[] ch = each.toCharArray();
            Arrays.sort(ch);
            String temp = new String(ch);

            map.computeIfAbsent(temp, k -> new ArrayList<>()).add(each);
        }
        
        return new ArrayList<>(map.values());
    }
}