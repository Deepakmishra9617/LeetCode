class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
  StringBuilder merged = new StringBuilder();
  int i=0;
  int j =0;
  while(i<n ||j<m){
    if(i<n){
    merged.append(word1.charAt(i));
    i++;
  }
  if(j<m){
    merged.append(word2.charAt(j));
    j++;
  }
  }
return merged.toString();
}
}