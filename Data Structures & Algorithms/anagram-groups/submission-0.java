class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        HashMap<String , List<String>> map = new HashMap<>();
        for(String str: strs ){
           char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortStr = new String(chars);
           
           if(map.containsKey(sortStr)){
            map.get(sortStr).add(str);
           }else{
            List<String> strList = new ArrayList<>();
            strList.add(str);
            map.put(sortStr,strList);
           }
        }
        return new ArrayList<>(map.values());
    }
}
