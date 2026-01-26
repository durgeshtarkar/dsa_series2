class Solution {
    public boolean isPalindrome(String s , int start , int end){
        while(start < end){
            if(s.charAt(start)!= s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    private void palindromePartitioning(String s , int index ,List<String> sublist ,List<List<String>> res ){
        if(index== s.length()){
            res.add(new ArrayList<>(sublist));
            return;
        }
        for(int i = index ; i < s.length() ; i++){
            if(isPalindrome(s,index, i)){
                sublist.add(s.substring(index, i+1));
                palindromePartitioning(s,i+1,sublist,res);
                sublist.remove(sublist.size()-1);
            }
        }
        

    }
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        palindromePartitioning(s,0,new ArrayList<>() ,res);

        return res;
    }
}