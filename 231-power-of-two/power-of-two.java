class Solution {
    public boolean isPowerOfTwo(int n) {
       int countSetBit = 0;
       for(int i = 0 ; i < 31 ; i++){
            if((n>>i)%2 == 1){
                countSetBit++;
            }
            
       }
       if(countSetBit==1){
          return true;
       }
       
       return false;
    }
}