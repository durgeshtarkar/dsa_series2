class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];// bcoz uppercase and lowercase both
        for(char c : s.toCharArray()){
            freq[c]++;
        }
        StringBuilder res =  new StringBuilder();
        while(res.length() < s.length()){
            int maxFreq = 0;
            char maxChar = 0;
            for(int i = 0 ; i < 128 ; i++){
                if(freq[i]  > maxFreq){
                    maxFreq = freq[i];
                    maxChar = (char)i; // convert to char
                    
                }
                
            }
            for(int i = 0 ; i < maxFreq ; i++){
                res.append(maxChar);
            }
            freq[maxChar] = 0; // marked it is visited;
        }
            
        
        return res.toString();      
    }
}