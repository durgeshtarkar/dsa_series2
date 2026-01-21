class Solution {
    static void dfs(String curr , int n , List<String> res){
            if(curr.length()==n){
                res.add(curr);
                return;
            }
            dfs(curr+"1", n , res);
            if(curr.isEmpty()  || curr.charAt(curr.length()-1)!='0'){
                dfs(curr+"0" , n , res);
            }
    }
    public List<String> validStrings(int n) {
      List<String>  res = new ArrayList<>();
      dfs("",n,res);
      return res;
    }
}