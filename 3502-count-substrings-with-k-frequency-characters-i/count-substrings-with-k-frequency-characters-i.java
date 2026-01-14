class Solution {
    public int numberOfSubstrings(String s, int k) {
        int ans  = 0;
        int l = 0;
        int r = 0;
        int n = s.length();
        int[] freq = new int[26];
        while( r < s.length()){
            freq[s.charAt(r)-'a']++;
            while(freq[s.charAt(r)-'a'] >= k){
                ans+= (n-r);
                freq[s.charAt(l)-'a']--;
                l++;
            }
            r++;
        
        }
        return ans;
       
    }
}