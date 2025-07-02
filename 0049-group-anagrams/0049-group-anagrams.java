class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String ns = new String(chars);
            if(map.containsKey(ns)) {
                map.get(ns).add(s);
            } else {
                List<String> l = new ArrayList<>();
                l.add(s);
                map.put(ns, l);
            }
        }
        return new ArrayList(map.values());
    }
}