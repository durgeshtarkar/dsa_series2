class Solution {
    public int xorOperation(int n, int start) {
        int res = 0;
        int curr = 0;
        for(int i = 0; i < n ; i++){
             curr = start + 2*i;
            res^=curr;
        }

        return res;


        
    }
}