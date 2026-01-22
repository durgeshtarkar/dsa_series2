class Solution {
    static void addParenthesis(String curr , int n ,int l , int r, List<String> res){
        if(curr.length()== 2*n){
            res.add(curr);
            return;
        }
        if(l < n){
            addParenthesis(curr+"(",n,l+1,r,res);
        }
        if( r < l){
            addParenthesis(curr+")",n,l,r+1,res);
            r++;
        }
        
        
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        addParenthesis("" ,n,0 , 0,res);

        return res;
        
    }
}