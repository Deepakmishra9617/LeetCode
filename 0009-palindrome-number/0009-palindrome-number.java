class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        StringBuilder b = new StringBuilder(s);
        b.reverse();
        String S1 = b.toString();
        return s.equals(S1);


    
        
    }
}