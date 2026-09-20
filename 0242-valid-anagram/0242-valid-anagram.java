class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m= t.length();
        if(n!=m)return false;
        Map<Character,Integer>map1 = new HashMap<>();
        Map<Character,Integer>map2 = new HashMap<>();
        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
           if(map1.containsKey(ch)){
            map1.put(ch,map1.get(ch)+1);
           }
           else{
            map1.put(ch,1);
           }
        }
        for (int i=0;i<m;i++){
            char ch =t.charAt(i);
            if(map2.containsKey(ch)){
                map2.put(ch,map2.get(ch)+1);
            }
            else{
                map2.put(ch,1);
            }
        }
if (map1.equals(map2)){
    return true;
}
return false;
    }
}