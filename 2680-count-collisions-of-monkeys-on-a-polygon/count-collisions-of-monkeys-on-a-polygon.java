class Solution {
    private long MOD = 1_000_000_007;
    private long fastpow(int x , int n){
         if(n==0){
            return  1;
        }
        long half = fastpow(x ,n/2 )%MOD;
            if(n%2==0){
                return (half*half)%MOD;
            }else{
                return  (x*half*half)%MOD;
            }
    }
    private int collision(int n){
        long res = fastpow(2,n) - 2;
        res = (res % MOD + MOD)%MOD; // MOD PLUS ISLYE KIA H KYUNKI AEK EDGE CASE ME 1-2= -1 A RHA TO NEGATIVE KO HANDLE KRNE KE LIYE

        return (int) res;
    }
    public int monkeyMove(int n) {
            
        return collision(n);
        
    }
}